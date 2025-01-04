import java.util.Scanner;

public class C1_13 {
    public  static  void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str="";

        while (!str.equals("stop"))
        {
            str= in.nextLine();
            direction ans=new direction(str);
            ans.fangxiang();
        }

    }
}


class direction
{
    private String str;
    public direction(String str)
    {
        this.str=str;
    }
    public void fangxiang()
    {
        switch (str)
        {
            case "N":
                System.out.println("向北走一步");
                break;
            case "S":
                System.out.println("向南走一步");
                break;
            case "W":
                System.out.println("向西走一步");
                break;
            case "E":
                System.out.println("向东走一步");
                break;
        }
    }
}