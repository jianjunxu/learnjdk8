package com.jayden.basic.spi;

import java.util.List;

/**
 * Created by za-xujianjun on 2017/3/28.
 */
public class Test {
    public static void main(String[] args){
        Search search = SearchFactory.newSearch();
        List<String> list = search.search("hello");
        System.out.println(list.toString());
    }
}
