/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.Objects;

public class C4_2 {
    public static void main(String[] args) {
        Point_2 a = new Point_2(5, 6);
        System.out.println(a.getY());  // 输出: 6.0
        System.out.println(a.toString());  // 输出: Point_2@<hashcode>改写了 (5.0, 6.0)

        LabeledPoint_2 b = new LabeledPoint_2("ajaja", 66, 33);
        System.out.println(b.toString());  // 输出: LabeledPoint_2@<hashcode>改写了 (ajaja, 66.0, 33.0)
    }
}

class Point_2 {
    double x;
    double y;

    public Point_2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point_2 point_2 = (Point_2) o;
        return Double.compare(point_2.x, x) == 0 &&
                Double.compare(point_2.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class LabeledPoint_2 extends Point_2 {
    private String label;

    public LabeledPoint_2(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + label + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabeledPoint_2 that = (LabeledPoint_2) o;
        return super.equals(o) && Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
