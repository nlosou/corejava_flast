/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class C3_12 {

    public static List<File> getSubdirectoriesLambda(File directory) {
        if (directory == null || !directory.isDirectory()) {
            throw new IllegalArgumentException("Provided file is not a directory");
        }
        List<File> subdirectories = new ArrayList<>();
        // 使用Lambda表达式作为FilenameFilter
        String[] fileNames = directory.list((File dir, String name) -> new File(dir, name).isDirectory());
        if (fileNames != null) {
            for (String name : fileNames) {
                subdirectories.add(new File(directory, name));
            }
        }
        return subdirectories;
    }

    public static void main(String[] args) {
        File dir = new File("/home/noser/java/C3/src/");
        List<File> subdirectories = getSubdirectoriesLambda(dir);
        for (File subdir : subdirectories) {
            System.out.println(subdir.getAbsolutePath());
        }
    }
}