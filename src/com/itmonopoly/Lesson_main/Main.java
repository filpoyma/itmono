package com.itmonopoly.Lesson_main;

import com.itmonopoly.Lesson_11.Recursion;

/**
 * Created by RoMan on 18.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        //Matrix.go();

        //********* Lesson 11*****************//
        Recursion fact = new Recursion();
        System.out.println(fact.factorial(5));

        Recursion fib = new Recursion();
        System.out.println(fib.fibanachi(5));
        System.out.println(fib.i);

    }
}
