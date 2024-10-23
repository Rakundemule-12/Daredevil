package org.example.ex_selenium;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the Number to Check Prime or Not:");
        int num = s.nextInt();
        int sum=0;
        for (int i = 1; i <num ; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }

        }
        if (sum == num)
        {
            System.out.println("The Given number "+num+" is a Prime Number");
        }

        else
        {
            System.out.println("The Given number "+num+" is not a Prime Number");
        }
    }
}
