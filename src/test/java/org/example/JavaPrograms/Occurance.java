package org.example.JavaPrograms;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a String to find palinderome");
        String a = s.nextLine();
        char [] ca = a.toCharArray();
        String ot ="";

        for (int i = ca.length-1; i>=0; i--)
        {
            ot = ot + ca[i];

        }

        if(ot.equals(a))
        {
            System.out.println("The given String is a palindrom");
        }

        else
        {
            System.out.println("String is not a palindrome");
        }


    }
}
