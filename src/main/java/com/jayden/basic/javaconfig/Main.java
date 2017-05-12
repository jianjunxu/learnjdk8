package com.jayden.basic.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by za-xujianjun on 2017/4/18.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService service = context.getBean(UseFunctionService.class);
        System.out.println(service.sayHello("java config"));
        context.close();
    }
}
