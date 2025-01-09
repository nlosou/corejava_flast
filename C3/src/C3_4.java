/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.Random;
import java.util.NoSuchElementException;

public class C3_4 {
    public interface IntSequence {
        int next();

        static IntSequence of(int n) {
            return new IntSequence() {
                private Random random = new Random();
                private int count = 0;
                private final int limit = n;

                @Override
                public int next() {
                    if (count >= limit) {
                        throw new NoSuchElementException("No more elements in the sequence");
                    }
                    count++;
                    return random.nextInt(); // 返回一个随机整数
                }
            };
        }
    }

    // 使用示例
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(5); // 生成一个包含5个随机整数的序列
        while (true) {
            try {
                System.out.println(sequence.next());
            } catch (NoSuchElementException e) {
                System.out.println("Reached the end of the sequence.");
                break;
            }
        }
    }
}