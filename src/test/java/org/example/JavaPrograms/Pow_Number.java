package org.example.JavaPrograms;

import java.util.Scanner;

public class Pow_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the Number to find power");
        int num = s.nextInt();
        int a = num;
        System.out.println("Please Enter the Power");
        int p = s.nextInt();

        for (int i = 1; i <p ; i++)
        {
            num = a * num;               //5*5=25*5

        }
        System.out.println("The power of a number is: "+num);
    }
}
