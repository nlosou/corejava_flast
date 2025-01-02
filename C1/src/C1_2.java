import java.util.Scanner;
import java.util.SplittableRandom;

public class C1_2 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        radius b=new radius(a);
        b.function();

    }
}

class radius{
    private int a;
    public  radius(int a)
    {
        this.a=a;
    }
    public void function() {
        a = a % 360;
        if (a < 0) {
            a = a + 360;
        }
        System.out.println(a);
    }
}
