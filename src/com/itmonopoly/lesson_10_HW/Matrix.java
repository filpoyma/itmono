package com.itmonopoly.lesson_10_HW;

/**
 * Created by RoMan on 18.06.2018.
 */
public class Matrix {
    static public void go(){
        int matrix[][] = new int[10][10];
        for(int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = j;
                System.out.print(matrix[i][j] + " ");
                if (j == 9) System.out.println();
            }
        int[][] tag = new int[10][10];
        for(int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++){

                int j_rnd = (int)(Math.random() * 9);
                int i_rnd = (int)(Math.random() * 9);
                if (tag[j_rnd][i_rnd] == 0) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i_rnd][j_rnd];
                    matrix[i_rnd][j_rnd] = tmp;
                } else {
                    j--;
                    i--;
                }
            }
        for (int[] tmp_m : matrix) {
            System.out.println();
            for (int tmp : tmp_m)
                System.out.print(tmp + " ");
        }
    }
}
