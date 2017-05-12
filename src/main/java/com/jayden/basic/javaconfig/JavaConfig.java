package com.jayden.basic.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by za-xujianjun on 2017/4/18.
 */
@Configuration
@ComponentScan("com.jayden.basic.javaconfig")
public class JavaConfig {
    public UseFunctionService serviceBean(){
        return new UseFunctionService();
    }
}
