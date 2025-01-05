public class C2_6 {
    public static void main(String[] args)
    {
        Point_class a=new Point_class(1,1);
        a.translate(3,4);
        a.scale(0.5);
        System.out.printf("%d %d",a.getX(),a.getY());
    }
}
class Point_class {
    private int x;
    private int y;

    public Point_class(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void function()
    {
        x=x+1;
        y=y+1;
    }
    public void translate(int dx,int dy)
    {
        x=x+dx;
        y=y+dy;
    }
    public void scale(double s)
    {
        x= (int) (x*s);
        y=(int)(y*s);
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return  this.y;
    }
}
