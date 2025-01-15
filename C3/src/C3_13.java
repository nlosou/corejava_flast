/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.function.BiConsumer;

public class C3_13 {

    // 使用Java内置的BiConsumer函数式接口
    public void function(BiConsumer<String, Integer> action) {
        // 调用Lambda表达式
        action.accept("Hello", 5);  // 示例调用
    }

    public static void main(String[] args) {
        C3_13 example = new C3_13();
        // 传递Lambda表达式给function方法
        example.function((name, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(name);
            }
        });
    }
}
