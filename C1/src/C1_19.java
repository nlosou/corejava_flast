import java.util.Scanner;

public class C1_19 {
    public static  void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]= in.nextInt();
            }
        }
        judege ans=new judege(arr);
        if(ans.function()==1)
        {
            System.out.print("是幻方");
        }
        else System.out.print("不是幻方");
    }
}

class judege {
    private final int[][] arr;
    public judege(int[][] arr)
    {
        this.arr=arr;
    }

    public int function()
    {
       int[] ans=new int[10];
       int k=0;
       for(int i=0;i<4;i++)
       {
           int sum=0;
           for(int j=0;j<4;j++)
           {
               sum=sum+arr[i][j];
           }
           ans[k]=sum;
           k++;
       }
        for(int j=0;j<4;j++)
        {
            int sum=0;
            for(int i=0;i<4;i++)
            {
                sum=sum+arr[i][j];
            }
            ans[k]=sum;
            k++;
        }


        int sum2=0;
        for(int i=0;i<4;i++)
        {
            sum2=sum2+arr[i][i];
        }
        ans[k]=sum2;
        k++;
        int sum3=0;
        int p=3;
        for(int i=3;i>=0;i--)
        {
            sum3=sum3+arr[i][p];
            p--;
        }
        ans[k]=sum3;
        for(int i=0;i<10;i++)
        {
            System.out.printf("%d ",ans[i]);
        }
        for(int i=0;i<10;i++)
        {
            if(ans[i]!=sum2) return 0;
        }
        return 1;
    }

}
