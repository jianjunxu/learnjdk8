package com.jayden.basic.spi.impl;

import com.jayden.basic.spi.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by za-xujianjun on 2017/3/28.
 */
public class FileSearch implements Search {
    @Override
    public List search(String keyWord) {
        List<String> res = new ArrayList<>();
        res.add("file search");
        return res;
    }
}
