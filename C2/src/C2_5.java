record Point(int x, int y) {
    // 平移方法
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    // 缩放方法
    public Point scale(double factor) {
        return new Point((int) (x * factor), (int) (y * factor));
    }
    public void function()
    {
        System.out.printf("%d %d",x,y);
    }

}

public class C2_5 {
    public static void main(String[] args)
    {
        Point p=new Point(3,4).translate(1,3).scale(0.5);

        p.function();
    }

}
