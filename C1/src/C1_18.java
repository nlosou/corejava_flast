import java.util.Random;

public class C1_18 {
    public static void main(String[] args)
    {
        int[] ans=new int[50];
        Random random=new Random();

        for(int i=1;i<=49;i++)
        {
            ans[i]=1;
        }
        int k=0;
        while (k!=6)
        {
            int randomin= random.nextInt(1,50);
            if(ans[randomin]==1)
            {
                ans[randomin]=0;
                k++;
                System.out.println(randomin);
            }
        }
    }
}
