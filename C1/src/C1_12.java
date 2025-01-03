import java.util.Scanner;

public class C1_12 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        compass a=new compass(str);
        a.function();
    }

}


class compass
{
    private final String str;
    public compass(String str)
    {
        this.str=str;
    }

    public void function()
    {
        switch (str)
        {
            case "N":
                System.out.print("1\n0");
                break;
            case "S":
                System.out.print("0\n-1");
                break;
            case  "W":

                System.out.print("-1 0");
            break;
                case "E":
                    System.out.print("0 1");
                    break;
        }
    }
}
