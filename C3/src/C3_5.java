/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.NoSuchElementException;

public class C3_5 {
    public interface IntSequence2 {
        int constant();
        static C3_5.IntSequence2 of(int n) {
            return new C3_5.IntSequence2() {
                private int count = 0;
                private final int limit = n;

                @Override
                public int constant() {
                    if (count >= limit) {
                        throw new NoSuchElementException("No more elements in the sequence");
                    }
                    count++;
                    return 1; // 返回一个随机整数
                }
            };
        }
    }

    // 使用示例
    public static void main(String[] args) {
        C3_5.IntSequence2 sequence = C3_5.IntSequence2.of(1000); // 生成一个包含5个随机整数的序列
        while (true) {
            try {
                System.out.print(sequence.constant());
            } catch (NoSuchElementException e) {
                System.out.println("Reached the end of the sequence.");
                break;
            }
        }
    }
}
