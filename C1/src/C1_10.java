import java.util.Random;

public class C1_10 {
    public static void main(String[] args)
    {
        Random a=new Random();
        long randlong=a.nextLong();
        transfer_1 b=new transfer_1(randlong);
        b.function();
    }
}

class transfer_1{
    private long a;
    public transfer_1(long a)
    {
        this.a=a;

    }

    public void function()
    {

        StringBuilder builder=new StringBuilder();
            long temp;
            while (a!=0){
                temp=a%36;
                if(temp<=9)
                {
                    builder.append(temp);
                }
                else{
                    switch ((int) temp)
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

                        case 16:
                            builder.append('G');
                            break;

                        case 17:
                            builder.append('H');
                            break;
                        case 18:
                            builder.append('I');
                            break;

                        case 19:
                            builder.append('J');
                            break;

                        case 20:
                            builder.append('K');
                            break;

                        case 21:
                            builder.append('L');
                            break;


                        case 22:
                            builder.append('M');
                            break;

                        case 23:
                            builder.append('N');
                            break;
                        case 24:
                            builder.append('O');
                            break;

                        case 25:
                            builder.append('P');
                            break;

                        case 26:
                            builder.append('Q');
                            break;

                        case 27:
                            builder.append('L');
                            break;

                        case 28:
                            builder.append('S');
                            break;

                        case 29:
                            builder.append('T');
                            break;
                        case 30:
                            builder.append('U');
                            break;

                        case 31:
                            builder.append('V');
                            break;

                        case 32:
                            builder.append('W');
                            break;

                        case 33:
                            builder.append('S');
                            break;


                        case 34:
                            builder.append('Y');
                            break;


                        case 35:
                            builder.append('Z');
                            break;
                    }
                }
                a=a/36;
            }

            System.out.print(builder.reverse());

        }
    }


