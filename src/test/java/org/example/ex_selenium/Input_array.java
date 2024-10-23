package org.example.ex_selenium;

import java.util.Arrays;
import java.util.Scanner;

public class Input_array {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the String to rotate:");
        String str = s.nextLine();
        char [] a = str.toCharArray();
        char b = 0;
        int n=3;
        for (int j = 1; j <=n ; j++)
        {
            b = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--)
            {
                a[i] = a[i - 1];

            }
            a[0] = b;
        }
        System.out.println("The rotated string is: "+ Arrays.toString(a));

    }


}
