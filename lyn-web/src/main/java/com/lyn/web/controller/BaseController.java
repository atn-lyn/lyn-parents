package com.lyn.web.controller;

import com.lyn.common.exception.DescribeException;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.lock.DistributedLockByCurator;
import com.lyn.common.lock.DistributedRedisLock;
import com.lyn.common.utils.ResultUtils;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.web.constants.WebConstant;
import com.lyn.common.fastdfs.FastdfsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@RestController
@RequestMapping("/api/lyn/")
public class BaseController {

    private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    @Value("${fastdfs.file.domain}")
    private String FILE_DOMAIN;

    @Autowired
    private DistributedLockByCurator distributedLockByCurator;

    @Autowired
    private FastdfsService fastdfsService;

    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public Object uploadFile(MultipartFile file, HttpServletRequest request) throws Exception{
        UserInfo loginUser = (UserInfo) request.getAttribute(WebConstant.LOGIN_SESSION);
        if (!file.isEmpty()) {
            long size = file.getSize();

            if(size >=5242880){//大于5M则驳回
                return ResultUtils.fail("上传图片过大");
            }
            String url = fastdfsService.uploadFile(file);
            LOGGER.info("【文件上传】文件访问路径:"+FILE_DOMAIN+url+", 上传者["+loginUser.getUserId()+"|"+loginUser.getUserName()+"]");
            return ResultUtils.success(FILE_DOMAIN+url,"ok");
        }
        return ResultUtils.fail("文件不存在！");
    }

    @RequestMapping(value = "lockTest", method = RequestMethod.POST)
    public Object lockTest(HttpServletRequest request) throws Exception{
        String key = "test";
        DistributedRedisLock.lockup(key);
        LOGGER.info("=========================执行测试任务");
        //TODO 业务代码
        DistributedRedisLock.release(key);
        return ResultUtils.success("锁测试结束！");
    }

    @RequestMapping(value = "curatorlock1", method = RequestMethod.POST)
    public Object curatorlock1(HttpServletRequest request) throws Exception{
        String path = "test";
        Boolean flag;
        distributedLockByCurator.acquireLock(path);
        try {
            //TODO 业务代码
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            flag = distributedLockByCurator.release(path);
        }
        flag = distributedLockByCurator.release(path);
        return ResultUtils.success(flag);
    }

    @RequestMapping(value = "curatorlock2", method = RequestMethod.POST)
    public Object curatorlock2(HttpServletRequest request) throws Exception{
        String path = "test";
        Boolean flag;
        distributedLockByCurator.acquireLock(path);
        try {
            //TODO 业务代码
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            flag = distributedLockByCurator.release(path);
        }
        flag = distributedLockByCurator.release(path);
        return ResultUtils.success(flag);
    }
}