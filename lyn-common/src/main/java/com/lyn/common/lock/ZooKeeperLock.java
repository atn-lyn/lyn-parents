package com.lyn.common.lock;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * <p>ZK锁</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/29 0029
 * @since jdk1.8
 */
public class ZooKeeperLock implements Watcher {

    private static Logger logger = LoggerFactory.getLogger(ZooKeeperLock.class);
    private ZooKeeper zk = null;
    private static final String LOCK_ROOT = "/zklock";//根节点
    private String lockName;
    private String currentLock;
    private String waitLock;
    private CountDownLatch countDownLatch;
    private int sessionTimeout = 30000;

    /**
     * 构造器中创建ZK链接，创建锁的根节点
     * @param zkAddress
     */
    public ZooKeeperLock(String zkAddress) {
        try {
            // 创建连接，zkAddress格式为：IP:PORT
            zk = new ZooKeeper(zkAddress,this.sessionTimeout,this);
            // 检测锁的根节点是否存在，不存在则创建
            Stat stat = zk.exists(LOCK_ROOT,false);
            if (null == stat) {
                zk.create(LOCK_ROOT, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
        } catch (Exception e)  {
            logger.error("【创建ZK锁链接失败】"+e.getMessage(),e);
        }
    }

    /**
     * 2-加锁,不能加锁则等待上一个锁的释放
     * @return
     */
    public boolean lock(String lockName){
        this.lockName = lockName;
        if (this.tryLock()) {
            logger.info("线程【" + Thread.currentThread().getName() + "】加锁(" + this.currentLock + ")成功！");
            return true;
        } else {
            return waitOtherLock(this.waitLock, this.sessionTimeout);
        }
    }

    /**
     * 尝试加锁
     * @return
     */
    public boolean tryLock(){
        // 分隔符
        String split = "_lock_";
        if (this.lockName.contains("_lock_")) {
            throw new RuntimeException("lockName can't contains '_lock_' ");
        }
        try {
            // 创建锁节点（临时有序节点）
            this.currentLock = zk.create(this.LOCK_ROOT + "/" + this.lockName + split, new byte[0],
                    ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
            System.out.println("线程【" + Thread.currentThread().getName()
                    + "】创建锁节点(" + this.currentLock + ")成功，开始竞争...");
            // 取所有子节点
            List<String> nodes = zk.getChildren(this.LOCK_ROOT, false);
            // 取所有竞争lockName的锁
            List<String> lockNodes = new ArrayList<String>();
            for (String nodeName : nodes) {
                if (nodeName.split(split)[0].equals(this.lockName)) {
                    lockNodes.add(nodeName);
                }
            }
            Collections.sort(lockNodes);
            // 取最小节点与当前锁节点比对加锁
            String currentLockPath = this.LOCK_ROOT + "/" + lockNodes.get(0);
            if (this.currentLock.equals(currentLockPath)) {
                return true;
            }
            // 加锁失败，设置前一节点为等待锁节点
            String currentLockNode = this.currentLock.substring(this.currentLock.lastIndexOf("/") + 1);
            int preNodeIndex = Collections.binarySearch(lockNodes, currentLockNode) - 1;
            this.waitLock = lockNodes.get(preNodeIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 阻塞等待
     * @param waitLock
     * @param sessionTimeout
     * @return
     */
    private boolean waitOtherLock(String waitLock, int sessionTimeout){
        boolean islock = false;
        try {
            // 监听等待锁节点
            String waitLockNode = this.LOCK_ROOT + "/" + waitLock;
            Stat stat = zk.exists(waitLockNode,true);
            if (null != stat) {
                System.out.println("线程【" + Thread.currentThread().getName()
                        + "】锁(" + this.currentLock + ")加锁失败，等待锁(" + waitLockNode + ")释放...");
                // 设置计数器，使用计数器阻塞线程
                this.countDownLatch = new CountDownLatch(1);
                islock = this.countDownLatch.await(sessionTimeout, TimeUnit.MILLISECONDS);
                this.countDownLatch = null;
                if (islock) {
                    System.out.println("线程【" + Thread.currentThread().getName() + "】锁（"
                            + this.currentLock + ")加锁成功，锁(" + waitLockNode + ")已经释放");
                } else {
                    System.out.println("线程【" + Thread.currentThread().getName() + "】锁("
                            + this.currentLock + ")加锁失败...");
                }
            } else {
                islock = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("【ZK等待异常】"+e.getMessage(),e);
        }
        return islock;
    }

    /**
     * 释放锁
     * @throws InterruptedException
     */
    public void release() throws Exception {
        try {
            Stat stat = zk.exists(this.currentLock,false);
            if (null != stat) {
                System.out.println("线程【" + Thread.currentThread().getName() + "】释放锁 " + this.currentLock);
                zk.delete(this.currentLock, -1);
                this.currentLock = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("【释放ZK锁异常】"+e.getMessage(),e);
        } finally {
            zk.close();
        }
    }

    //监听器回调
    @Override
    public void process(WatchedEvent watchedEvent) {
        if (null != this.countDownLatch && watchedEvent.getType() == Event.EventType.NodeDeleted) {
            // 计数器减一，恢复线程操作
            this.countDownLatch.countDown();
        }
    }
}
