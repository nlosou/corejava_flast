/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C5_1 {

    public ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> values = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    double value = Double.parseDouble(line);
                    values.add(value);
                } catch (NumberFormatException e) {
                    System.out.println("无法解析为double：" + line);
                }
            }
        }
        return values;
    }

    public static void main(String[] args) {
        C5_1 c5_1 = new C5_1();
        try {
            ArrayList<Double> values = c5_1.readValues("path/to/your/file.txt");
            System.out.println(values);
        } catch (IOException e) {
            System.out.println("读取文件时发生错误：" + e.getMessage());
        }
    }
}
