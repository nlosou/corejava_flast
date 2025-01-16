/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public class C4_9 {
    public static void main(String[] args) {
        StringList list = new EmptyStringList();
        list = list.append("Hello");
        list = list.append("World");
        list = list.append("!");

        System.out.println("List: " + list); // 输出: [Hello, World, !]
        System.out.println("Size: " + list.size()); // 输出: 3
    }
}