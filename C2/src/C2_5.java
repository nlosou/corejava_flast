/**
 * The type Point.
 */
record Point(int x, int y) {
    /**
     * Translate point.
     *
     * @param dx the dx
     * @param dy the dy
     * @return the point
     */
// 平移方法
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    /**
     * Scale point.
     *
     * @param factor the factor
     * @return the point
     */
// 缩放方法
    public Point scale(double factor) {
        return new Point((int) (x * factor), (int) (y * factor));
    }

    /**
     * Function.
     */
    public void function()
    {
        System.out.printf("%d %d",x,y);
    }

}

/**
 * The type C 2 5.
 */
public class C2_5 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Point p=new Point(3,4).translate(1,3).scale(0.5);

        p.function();
    }

}
