package com.itmonopoly.Lesson_main;

import com.itmonopoly.Lesson_11.Point;
import com.itmonopoly.Lesson_11.Recursion;
import com.itmonopoly.Lesson_11.Triangle;
import com.itmonopoly.Lesson_11_HW.Triangle2;
import com.itmonopoly.Lesson_11_HW.Point2;

public class Main {
    public static void main(String[] args) {
        //Matrix.go();

        //********* Lesson 11*****************//
//        Recursion fact = new Recursion();
//        System.out.println(fact.factorial(5));
//
//        Recursion fib = new Recursion();
//        System.out.println(fib.fibanachi(5));
//        System.out.println(fib.i);

        //********** Lesson 11 *******************//

        Point p1 = new Point(2, 5);
        Point p2 = new Point(4, 3);
        Point p3 = new Point(6, 1);
        Triangle triangle = new Triangle(p1, p2, p3);
        triangle.setVertex(triangle);
        triangle.print();

//        Point2 p1 = new Point2(1, 1);
//        Point2 p2 = new Point2(2, 2);
//        Point2 p3 = new Point2(3, 3);
//        Triangle2 triangle = new Triangle2(p1, p2, p3);
//        triangle.setVertex(p1);
//        triangle.print();




    }
}
