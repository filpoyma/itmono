package com.itmonopoly.Lesson_08;

/**
 * Created by Rom on 21.06.2018.
 */
import java.util.Random;
import java.util.Scanner;

public class StrScan {
    public static void main(String[] args) {
        String str1 = "Ann";
        String str2 = new String();
        str2 = "Benn";
        String str3 = new String("Strinnn");
        String str4 = new String(new char[]{'a', 'b', 'c'});

        String formatted = String.format("Hello %s and %s", str1, str4);
        System.out.println(formatted);
        for(int i = 0; i <= 1000; i+=100) System.out.printf("%10d\n", i);

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (true) {
            int rnd_num = rnd.nextInt();
            while (rnd_num <= 10) {
                rnd_num /= 10;
                i++;
            }
            System.out.printf("Num = %10d", rnd_num);
            String str = scan.nextLine();
            if (str.toLowerCase().equals("exit")) break;

        }
    }
}