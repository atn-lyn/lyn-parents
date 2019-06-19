package com.lyn.sys.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyn.common.exception.DescribeException;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.sys.api.entity.UserInfoExample;
import com.lyn.sys.api.service.UserService;
import com.lyn.sys.service.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/13 0013
 * @since jdk1.8
 */
@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int addUser(UserInfo userInfo) throws Exception{
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andMobileEqualTo(userInfo.getMobile());
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userInfo.getUserName());
        example.or(criteria);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        if(list != null && list.size() >0){
            throw new DescribeException(ExceptionEnum.OPERATE_ERROR);
        }
        userInfo.setStatus(true);
        userInfo.setCreateTime(new Date());
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo findUserInfoById(Integer userId) throws Exception {
        System.out.println("================查询用户信息");
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int deleteUserInfo(Integer userId) throws Exception {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public UserInfo login(String mobile, String password) throws Exception{
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andMobileEqualTo(mobile).andPasswordEqualTo(password);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        if(list != null && list.size() >0){
            return list.get(0);
        }
        return null;
    }
}
