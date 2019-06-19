package com.lyn.sys.api.service;

import com.lyn.sys.api.entity.UserInfo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/13 0013
 * @since jdk1.8
 */
public interface UserService {

    int addUser(UserInfo userInfo) throws Exception;

    UserInfo findUserInfoById(Integer userId) throws Exception;

    int deleteUserInfo(Integer userId) throws Exception;

    UserInfo login(String mobile, String password) throws Exception;
}
