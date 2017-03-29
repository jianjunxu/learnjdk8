package com.jayden.basic.controller;

import com.jayden.basic.domain.UserDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by za-xujianjun on 2017/3/28.
 */
@RestController
public class HelloController {
    @RequestMapping("/helloworld")
    public String sayHello(){
        return "Hello World!----sswwwwss";
    }

    @RequestMapping("/getUser")
    public UserDO getUser(){
        UserDO user = new UserDO();
        user.setUserName("Jayden");
        user.setPass("password");
        return user;
    }
}
