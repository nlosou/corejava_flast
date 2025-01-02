import java.math.BigInteger;
import java.util.Scanner;
import java.util.SplittableRandom;

public class C1_6 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        jiec jishuan=new jiec(a);
        System.out.println(jishuan.function(a));
    }
}

class jiec{
    private int a;
    public jiec(int a)
    {
        this.a=a;
    }

    public  BigInteger function(int a)
    {
        if(a==1) return BigInteger.ONE;
        return BigInteger.valueOf(a).multiply(function(a - 1));
    }
}
