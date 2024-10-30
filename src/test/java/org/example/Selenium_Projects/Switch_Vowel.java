package org.example.Selenium_Projects;

import java.util.Scanner;

public class Switch_Vowel {
    public static void main(String[] args)
    {
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter any Character");
        char c = s.next().charAt(0);
        String p = "";
        if (p.equals(s.nextLine()))
        {
            System.out.println("Please do not enter any String");
        }

        switch (c)
        {
            case 'a':
                System.out.println("'a' is a vowel");
                break;
            case 'e':
                System.out.println("'e' is a vowel");
                break;
            case 'i':
                System.out.println("'i' is a vowel");
                break;
            case 'o':
                System.out.println("'o' is a vowel");
                break;
            case 'u':
                System.out.println("'u' is a vowel");
                break;
            case 'A':
                System.out.println("'A' is a vowel");
                break;
            case 'E':
                System.out.println("'E' is a vowel");
                break;
            case 'I':
                System.out.println("'I' is a vowel");
                break;
            case 'O':
                System.out.println("'O' is a vowel");
                break;
            case 'U':
                System.out.println("'U' is a vowel");
                break;
            default:
                System.out.println("Please enter a valid character");

        }



    }
}
