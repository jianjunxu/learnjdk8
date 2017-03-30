package com.jayden.basic.config;

import com.jayden.basic.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by za-xujianjun on 2017/3/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ConfigTest {
    @Autowired
    private Environment env;

    @Test
    public void test(){
        System.out.println(env.getProperty("debug"));
    }
}
