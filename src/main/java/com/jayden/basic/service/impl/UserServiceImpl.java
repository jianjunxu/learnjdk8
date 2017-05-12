package com.jayden.basic.service.impl;

import com.jayden.basic.domain.UserDO;
import com.jayden.basic.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by za-xujianjun on 2017/5/12.
 */
@Service
public class UserServiceImpl implements UserService {

    //使用缓存
    @Override
    @Cacheable(value = "userCache",keyGenerator = "wiselyKeyGenerator")
    public UserDO findUser(long id) {
        System.out.println("无缓存的时候调用这里");
        UserDO user = new UserDO();
        user.setId(1);
        user.setUserName("张三");
        user.setAlias("小三");
        user.setAddress("上海市上海市黄浦区");
        return user;
    }
}
