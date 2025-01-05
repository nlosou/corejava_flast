/**
 * The type C 2 6.
 */
public class C2_6 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Point_class a=new Point_class(1,1);
        a.translate(3,4);
        a.scale(0.5);
        System.out.printf("%d %d",a.getX(),a.getY());
    }
}

/**
 * The type Point class.
 */
class Point_class {
    private int x;
    private int y;


    /**
     * Instantiates a new Point class.
     *
     * @param x the x
     * @param y the y
     */
    public Point_class(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     * Function.
     */
    public void function()
    {
        x=x+1;
        y=y+1;
    }

    /**
     * Translate.
     *
     * @param dx the dx
     * @param dy the dy
     */
    public void translate(int dx,int dy)
    {
        x=x+dx;
        y=y+dy;
    }

    /**
     * Scale.
     *
     * @param s the s
     */
    public void scale(double s)
    {
        x= (int) (x*s);
        y=(int)(y*s);
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public int getY()
    {
        return  this.y;
    }


}
