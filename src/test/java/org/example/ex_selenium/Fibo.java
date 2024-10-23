package org.example.ex_selenium;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the number:");
        int num = s.nextInt();
        int a = 1;
        int b = 1;
        int f = 0;

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");

        while (f<=num)
        {
            f = a + b;
            if (f>num) {

                break;
            }
            System.out.print(f);
            System.out.print(" ");

            a = b;
            b = f;
        }
    }
}
