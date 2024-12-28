package org.example.JavaPrograms;

import java.util.Scanner;

public class Compare_Strings {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String s1 = s.nextLine();
        System.out.println("Enter the Second String:");
        String s2 = s.nextLine();
        boolean C = true;

        for (int i = 0; i <s1.length() ; i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
            {
                C = false;
                break;
            }
        }

        System.out.println();

        if (!C)
        {
            System.out.println("Entered Strings Do not Match ");
        }
        else
        {
            System.out.println("Entered Strings Matches");
        }


    }
}
