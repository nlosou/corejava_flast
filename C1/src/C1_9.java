import java.util.Scanner;

public class C1_9 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] ans=a.split(" ");
        if(ans[0].equals(ans[1]))
        {
            System.out.println("相同");
        }
        else System.out.println("不同");
    }
}
