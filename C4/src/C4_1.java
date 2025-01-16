/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.nio.channels.Pipe;

public class C4_1 {
    public static void main(String[] args)
    {
        Point a=new Point(5,6);
        System.out.println(a.getY());
        LabeledPoint b=new LabeledPoint("ajaja",66,33);
        System.out.print(b.getLabel());
        System.out.println(b.getY());
        b.print_();
    }
}
 class Point{
     protected double x;
     protected double y;
    public Point(double x, double y)
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
 }

 class LabeledPoint extends Point{
    private String label;
    public LabeledPoint(String label,double x,double y)
    {
        super(x,y);
        this.label=label;

    }

     public String getLabel() {
         return label;
     }

     public void print_()
     {
         System.out.println(x+y);
     }
 }
