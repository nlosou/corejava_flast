/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class C3_11 {

    public static List<File> getSubdirectoriesLambda(File directory) {
        if (directory == null || !directory.isDirectory()) {
            throw new IllegalArgumentException("Provided file is not a directory");
        }
        List<File> subdirectories = new ArrayList<>();//对象实例
        // 使用Lambda表达式作为FileFilter
        File[] files = directory.listFiles(file -> file.isDirectory());
        if (files != null) {
            for (File file : files) {
                subdirectories.add(file);
            }
        }
        return subdirectories;
    }

    public static void main(String[] args) {
        File dir = new File("/home/noser/java/C3/src");
        List<File> subdirectories = getSubdirectoriesLambda(dir);
        for (File subdir : subdirectories) {
            System.out.println(subdir.getAbsolutePath());
        }
    }
}
