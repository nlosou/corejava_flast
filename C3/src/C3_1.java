/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public class C3_1 {

    @FunctionalInterface
    public interface Measure {
        double getMeasure();
    }

    public class Employee implements Measure {
        private double salary; // 假设员工的度量值是工资

        public Employee(double salary) {
            this.salary = salary;
        }

        @Override
        public double getMeasure() {
            return this.salary; // 返回员工的工资作为度量值
        }

        public double average(Measure[] objects) {
            if (objects == null || objects.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            double sum = 0.0;
            for (Measure obj : objects) {
                sum += obj.getMeasure(); // 累加每个对象的度量值
            }
            return sum / objects.length; // 计算平均值
        }
    }

    public static void main(String[] args) {
        C3_1 c3_1 = new C3_1();
        C3_1.Employee emp1 = c3_1.new Employee(50000);
        C3_1.Employee emp2 = c3_1.new Employee(60000);
        C3_1.Employee emp3 = c3_1.new Employee(70000);

        C3_1.Employee[] employees = {emp1, emp2, emp3};

        double averageSalary = emp1.average(employees);
        System.out.println("Average Salary: " + averageSalary);
    }
}
