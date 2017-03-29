package com.jayden.basic.jdk8;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by za-xujianjun on 2017/3/28.
 */
public class FileTest {
    public static void main(String[] args) {
        File[] hiddenFiles7 = new File(".").listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
        for (File file : hiddenFiles7) {
            System.out.println("jdk7---" + file.getName());
        }
        // 方法引用（::） 将方法作为值传递
        File[] hiddenFiles8 = new File(".").listFiles(File::isHidden);
        for (File file : hiddenFiles8) {
            System.out.println("jdk8---" + file.getName());
        }
    }
}
