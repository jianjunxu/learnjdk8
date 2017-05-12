package com.jayden.basic.service;

import com.jayden.basic.domain.UserDO;

/**
 * Created by za-xujianjun on 2017/5/12.
 */
public interface UserService {
    UserDO findUser(long id);
}
