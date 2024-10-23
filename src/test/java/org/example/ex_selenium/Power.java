package org.example.ex_selenium;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Please Enter any Number:");
        int num = s.nextInt();
        System.out.println();
        System.out.println("Please Enter a Divisor");
        int d = s.nextInt();

//        int Onum = num;
        boolean b = false;
        while (num > 0)
        {
            int r = num % d;
            if (r!=0)
            {

                break;

            }
            num = num / d;
        }
            if (num==1)
            {
                System.out.println(STR."The Given number is a power of \{d}");
                b= true;



             }
            if (!b)
            {
                System.out.println(STR."The Given number is not a power of \{d}");
            }
    }
}
