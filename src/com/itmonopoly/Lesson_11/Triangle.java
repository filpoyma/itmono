package com.itmonopoly.Lesson_11;

/**
 * Created by RoMan on 20.06.2018.
 */
public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3 ) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public void setVertex(){
        if(!vertex1.inOneLine(vertex1, vertex2)) this.vertex1 = vertex1;
    }

    public void print(){
        System.out.println("Side 1: %f", vertex1.distance(vertex2));
        System.out.println("Side 2: %f", vertex2.distance(vertex3));
        System.out.println("Side 3: %f", vertex3.distance(vertex1));
    }
}
