/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.NoSuchElementException;
import java.util.Scanner;

public class C3_5 {

   // 使用示例
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        IntSequence ans=new IntSequence(a);
        ans.constant(()->System.out.print(1));

}

}
class  IntSequence{
    public int i;
    public IntSequence(int i)
    {
        this.i=i;
    }

    public void constant(Runnable action)
    {
        for(int k=0;k<=i;k++)
        {
            action.run();
        }
    }
}