import java.util.Scanner;

public class C2_4 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        IntHolder a=new IntHolder(1);
        IntHolder b=new IntHolder(2);
        int temp=a.getValue();

        a.setValue(b.getValue());
        b.setValue(temp);

        System.out.printf("%d %d",a.getValue(),b.getValue());


    }
}

class IntHolder {
    private int value;

    public IntHolder(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
