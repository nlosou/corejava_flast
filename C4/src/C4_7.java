/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */
public class C4_7{

    public static Object add(Object first, Object second) {
        // 使用模式匹配检查两个参数是否都是 Number 的实例
        if (first instanceof Number num1 && second instanceof Number num2) {
            return num1.doubleValue() + num2.doubleValue();
        }

        // 使用模式匹配检查两个参数是否都是 Boolean 的实例
        if (first instanceof Boolean bool1 && second instanceof Boolean bool2) {
            return bool1 || bool2;
        }

        // 其他情况，将它们拼接成字符串
        return first.toString() + second.toString();
    }

    public static void main(String[] args) {
        // 测试不同类型的参数
        System.out.println(add(1, 2)); // 输出: 3.0
        System.out.println(add(1.5, 2.5)); // 输出: 4.0
        System.out.println(add(true, false)); // 输出: true
        System.out.println(add("Hello", "World")); // 输出: HelloWorld
        System.out.println(add(1, "2")); // 输出: 12
        System.out.println(add(true, "false")); // 输出: truefalse
    }
}