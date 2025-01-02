import java.util.Scanner;

public class C1_3 {
    public  static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        iner_max sort=new iner_max(a,b,c);
        sort.find_max();
    }
}
class iner_max{
    private int a;
    private  int b;
    private int c;
    public  iner_max(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public void find_max()
    {
        // 使用if语句进行排序
        if (a > b) {
            // 如果a大于b，交换a和b
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            // 如果a大于c，交换a和c
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            // 如果b大于c，交换b和c
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.printf("%d %d %d",a,b,c);
    }


}
