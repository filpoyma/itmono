package com.itmonopoly.Lesson_11;

/**
 * Created by RoMan on 20.06.2018.
 */
public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public boolean isOneLine(Triangle vert) {
        return ( (int) Math.floor( (vert.vertex1.x * vert.vertex2.y + vert.vertex2.x * vert.vertex3.y + vert.vertex3.x * vert.vertex1.y) -
                                   (vert.vertex2.x * vert.vertex1.y + vert.vertex3.x * vert.vertex2.y + vert.vertex1.x * vert.vertex3.y) ) == 0);

    }

}
