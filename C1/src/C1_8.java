import java.util.Scanner;

public class C1_8 {
    public  static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] ans=a.split(" ");
        for (int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
