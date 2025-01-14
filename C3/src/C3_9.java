/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.SplittableRandom;

public class C3_9 {
    public static void main(String[] args)
    {
        Greeter a=new Greeter(5,"najja");
        Greeter b=new Greeter(9,"ssjss");
        // 创建并启动线程
        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start();
        threadB.start();

    }
}

class Greeter implements Runnable{
        private int n;
        private String targer;
        public Greeter(int n,String targer)
        {
            this.n=n;
            this.targer=targer;
        }
        public void run()
        {
                for(int i=0;i<n;i++)
                {
                    System.out.println("Hello,");
                }
                System.out.print(targer);
        }
}

