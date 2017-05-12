package com.jayden.basic.controller;

import com.jayden.basic.domain.UserDO;
import com.jayden.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by za-xujianjun on 2017/5/12.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    @ResponseBody
    public UserDO findUserCache(){
        UserDO userDO = userService.findUser(1l);
        return userDO;
    }
}
