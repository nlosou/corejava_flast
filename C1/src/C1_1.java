import java.util.Scanner;

public class C1_1 {

    public static  void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        transfer er=new transfer(a,b);
        er.function();
        //System.out.println(er.function());

    }


}

class transfer{
    private int a;
    private final int select;
    public transfer(int a,int select)
    {
        this.a=a;
        this.select=select;
    }

    public void function()
    {
        if(select==2)
        {
            int[] arr1=new  int[100];
            for(int i=0;i<100;i++)
            {
                arr1[i]=0;
            }
            int i=0;
            int temp;
            while (a!=0){
                temp=a%2;
                System.out.println(temp);
                arr1[i]=temp;
                i++;
                a=a/2;
            }
            int k=i;
            for(;k>0;k--)
            {

                System.out.print(arr1[k-1]);
            }
        }
        else if(select==8)
        {
            int[] arr1=new  int[100];
            for(int i=0;i<100;i++)
            {
                arr1[i]=0;
            }
            int i=0;
            int temp;
            while (a!=0){
                temp=a%8;
                System.out.println(temp);
                arr1[i]=temp;
                i++;
                a=a/8;
            }
            int k=i;
            for(;k>0;k--)
            {

                System.out.print(arr1[k-1]);
            }
        }
        else if(select==16)
        {   StringBuilder builder=new StringBuilder();
            int temp;
            while (a!=0){
                temp=a%16;
                if(temp<=9)
                {
                    builder.append(temp);
                }
                else{
                    switch (temp)
                    {
                        case 10:
                            builder.append('A');
                            break;

                        case 11:
                            builder.append('B');
                            break;
                        case 12:
                            builder.append('C');
                            break;

                        case 13:
                            builder.append('D');
                            break;

                        case 14:
                            builder.append('E');
                            break;

                        case 15:
                            builder.append('F');
                            break;
                    }
                }
                a=a/16;
            }

                System.out.print(builder.reverse());

        }
    }

}