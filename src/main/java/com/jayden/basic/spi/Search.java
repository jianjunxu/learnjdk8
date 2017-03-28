package com.jayden.basic.spi;

import java.util.List;

/**
 * Created by za-xujianjun on 2017/3/28.
 */
public interface Search<T> {
    List<T> search(String keyWord);
}
