/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.SplittableRandom;

public class C4_4 {
    public static void main(String[] args) {
        // 示例：创建一个 Circle 对象
        Circle circle = new Circle(new Point(0, 0), 5);
        System.out.println("Circle center: " + circle.getCenter().toString());

        // 示例：创建一个 Rectangle 对象
        Rectangle rectangle = new Rectangle(new Point(1, 1), 4, 3);
        System.out.println("Rectangle center: " + rectangle.getCenter().toString());

        // 示例：创建一个 Line 对象
        Line line = new Line(new Point(2, 2), new Point(5, 5));
        System.out.println("Line center: " + line.getCenter().toString());
    }
}

abstract class Shape {
    double x;
    double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moveBy(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public abstract Point getCenter();
}



class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super(center.getX(), center.getY());
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }
}

class Rectangle extends Shape {
    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft.getX() + width / 2, topLeft.getY() + height / 2);
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(x, y);
    }
}

class Line extends Shape {
    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super((from.getX() + to.getX()) / 2, (from.getY() + to.getY()) / 2);
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(x, y);
    }
}
