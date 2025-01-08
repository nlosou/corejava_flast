/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public class C3_2 {
    public static void main(String[] args) {
// 创建 Employee 对象
        text2.Employee emp1 = new text2.Employee(509393000,"a");
        text2.Employee emp2 = new text2.Employee(60000,"b");
        text2.Employee emp3 = new text2.Employee(70000,"c");

        // 创建 Measurable 对象数组
        text2.Measurable[] employees = {emp1, emp2, emp3};

        // 计算平均值
        //double averageSalary = emp1.average(employees);
        System.out.println(emp1.largest(employees).getName());
    }
}



class  text2{


    //@FunctionalInterface
    public interface Measurable{
        double getMeasure();
        String getName();
    }

    public static class Employee implements Measurable{
        private final double salay;
        private final String name;
        public Employee(double salay,String name)
        {
            this.salay=salay;
            this.name=name;
        }
        //@Override
        public double getMeasure()
        {
            return salay;
        }
        public String getName()
        {
            return name;
        }
        public String getName2()
        {
            return  name;
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
        public Measurable largest(Measurable[] objects)
        {
            Measurable A = null;
            double max=0;
            for(Measurable obj:objects)
            {
                if(obj.getMeasure()>max)
                {
                    max=obj.getMeasure();
                    A=obj;
                }
                System.out.println(((Employee)obj).getName2());
            }
            return  A;
        }



    }


}