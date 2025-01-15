/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

public class C4_2 {
    public static void main(String[] args)
    {
        Point_2 a= new Point_2(5,6);
        System.out.println(a.getY());
        System.out.println(a.toString());
        LabeledPoint_2 b= new LabeledPoint_2("ajaja",66,33);
        System.out.println(b.toString());

    }
}
class Point_2{
    double x;
    double y;
    public Point_2(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public String toString()
    {
        return super.toString()+"改写了";
    }
}

class LabeledPoint_2 extends Point{
    private String label;
    public LabeledPoint_2(String label,double x,double y)
    {
        super(x,y);
        this.label=label;

    }

    public String getLabel() {
        return label;
    }
}
