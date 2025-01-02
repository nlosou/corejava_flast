import java.util.Scanner;

public class C1_4 {
    public static  void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        double a= in.nextDouble();
        System.out.println(Math.nextUp(a));
        System.out.println(Math.nextDown(a));
    }
}
