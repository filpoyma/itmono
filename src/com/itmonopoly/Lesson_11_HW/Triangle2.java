package com.itmonopoly.Lesson_11_HW;


public class Triangle2 {
    public Point2 vertex1;
    public Point2 vertex2;
    public Point2 vertex3;

    public Triangle2(Point2 vertex1, Point2 vertex2, Point2 vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }


    public void setVertex(Point2 vertex1){
        if(vertex1.isOneLine(vertex2, vertex3)){
            System.out.println("Points on one line. ReCreate the triangle!");
            System.exit(-1);
        }
    }

    public void print(){
        System.out.printf("Side 1: %f\n", vertex1.distance(vertex2));
        System.out.printf("Side 2: %f\n", vertex2.distance(vertex3));
        System.out.printf("Side 3: %f\n", vertex3.distance(vertex1));

    }
}

