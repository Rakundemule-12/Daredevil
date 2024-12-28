package org.example.JavaPrograms;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Please Enter the String:");
        String str = s.nextLine();
        char [] a = str.toCharArray();
        String rev = "";
//        int size = a.length;
        for (int i = a.length-1; i >=0 ; i--)
        {
            rev = rev + a[i];

        }
        if (str.equals(rev))
        {
            System.out.println("The Given String "+str+" is a palindrome");
        }
        else
        {
            System.out.println("The Given String is not a palindrome");
        }

    }
}
