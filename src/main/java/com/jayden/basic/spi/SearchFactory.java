package com.jayden.basic.spi;

import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;

/**
 * Created by za-xujianjun on 2017/3/28.
 */
public class SearchFactory {
    private SearchFactory() {
    }

    public static Search newSearch() {
        Search search = null;
        ServiceLoader<Search> loader = ServiceLoader.load(Search.class);
        Iterator<Search> iters = loader.iterator();
        if (iters.hasNext()) {
            search = iters.next();
        }
        return Objects.requireNonNull(search, "config error.");
    }
}
