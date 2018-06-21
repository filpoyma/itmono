package com.itmonopoly.Lesson_11;

/**
 * Created by RoMan on 20.06.2018.
 */
     public class Recursion {
     public static long i = 0;
     public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

     public double fibanachi(int n) {
        if (n - 1 == 0 || n - 2 == 0) return 1;
        i++;
        return fibanachi(n - 1) + fibanachi(n - 2);

    }
}
