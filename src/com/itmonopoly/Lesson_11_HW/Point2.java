package com.itmonopoly.Lesson_11_HW;

/**
 * Created by RoMan on 20.06.2018.
 */
public class Point2 {
    private double x, y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point2 point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public boolean isOneLine(Point2 vertex2, Point2 vertex3) {
        return ( (int) Math.floor( (this.x * vertex2.y + vertex2.x * vertex3.y + vertex3.x * this.y) -
                (vertex2.x * this.y + vertex3.x * vertex2.y + this.x * vertex3.y) ) == 0);



    }

}

