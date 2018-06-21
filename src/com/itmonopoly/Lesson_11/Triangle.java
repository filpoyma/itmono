package com.itmonopoly.Lesson_11;

/**
 * Created by RoMan on 20.06.2018.
 */
public class Triangle {
       protected Point vertex1;
       protected Point vertex2;
       protected Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3 ) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;

        if ( vertex1.isOneLine(Triangle.this) ) {
            System.out.println("This is a line. Not a triangle!");
        }
    }


    public void setVertex(Triangle vert){ // как от сюда красиво достучаться до isOneLine
        if ( vert.vertex1.isOneLine(vert) ) {
            System.out.println("Points on one line. ReCreate the triangle!");
        }
    }

    public void print(){
        System.out.printf("Side 1: %f\n", vertex1.distance(vertex2));
        System.out.printf("Side 2: %f\n", vertex2.distance(vertex3));
        System.out.printf("Side 3: %f\n", vertex3.distance(vertex1));

    }
}
