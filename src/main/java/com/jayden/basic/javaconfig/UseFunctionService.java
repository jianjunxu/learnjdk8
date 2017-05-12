package com.jayden.basic.javaconfig;

/**
 * Created by za-xujianjun on 2017/4/18.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
