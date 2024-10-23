package org.example.ex_selenium;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number to check:");
        int num = s.nextInt();

        int on = num;
        int rn = 0;

        while (on != 0)
        {
            int r = on % 10;          //   1551.5
            rn = (rn * 10) + r;     //   1+51+
            on = on /10;

        }

        if (num==rn)
        {
            System.out.println("The Given Number is a palindrome");
        }
        else
        {
            System.out.println("The Given Number is not a palindrome");
        }


    }
}
