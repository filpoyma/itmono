package com.itmonopoly.Lesson_11;

/**
 * Created by RoMan on 20.06.2018.
 */
public class Circle {
    double x, y;
    double radius;
    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(double x2, double y2){
        return Math.sqrt( (Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)) );
    }
    public double distance (Circle oter){
        return distance(oter.x, oter.y);
    }

}
