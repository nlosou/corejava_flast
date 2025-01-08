/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.SplittableRandom;

public class C3_1 {

    public static void main(String[] args) {
// 创建 Employee 对象
        text1.Employee emp1 = new text1.Employee(50000,"a");
        text1.Employee emp2 = new text1.Employee(60000,"b");
        text1.Employee emp3 = new text1.Employee(70000,"c");

        // 创建 Measurable 对象数组
        text1.Measurable[] employees = {emp1, emp2, emp3};

        // 计算平均值
        double averageSalary = emp1.average(employees);
        System.out.println("Average Salary: " + averageSalary);
    }
}


class  text1{


    @FunctionalInterface
    public interface Measurable{
        double getMeasure();
    }

    public static class Employee implements Measurable{
        private double salay;
        private String name;
        public Employee(double salay,String name)
        {
            this.salay=salay;
            this.name=name;
        }
        @Override
        public double getMeasure()
        {
            return salay;
        }
         public double average(Measurable[] objects)
        {
            if (objects == null || objects.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            double sum = 0.0;
            for (Measurable obj : objects) {
                //System.out.println(obj);
                System.out.println(obj.getMeasure());
                sum += obj.getMeasure(); // 累加每个对象的度量值
            }
            return sum / objects.length; // 计算平均值
        }


    }


}
