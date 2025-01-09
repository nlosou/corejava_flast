/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.math.BigInteger;

public class C3_6 {
    public static void main(String[] args)
    {
        SquareSequence sequence = new SquareSequence(BigInteger.valueOf(1000));
        SquareSequence.Sequence seq = sequence.new function(); // 创建内部类的实例

        // 打印前几个平方数
        for (int i = 0; i < 5; i++) {
            System.out.println(seq.next());
        }
    }


}
class SquareSequence{
    private BigInteger current;

    interface Sequence<T>{
        BigInteger next();
    }
    public SquareSequence(BigInteger start) {
        this.current = start;
    }
    class function implements Sequence{
        // 生成下一个平方数
        public BigInteger next() {
            BigInteger nextSquare = current.pow(2); // 计算当前数的平方
            current = nextSquare; // 更新当前数为下一个平方数
            return nextSquare;
        }
    }

    // 重置序列到初始值
    public void reset(BigInteger start) {
        this.current = start;
    }

}
