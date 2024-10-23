package org.example.ex_selenium;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a Sentence:");
        String s1 = s.nextLine();
        int c = countwords(s1);
        System.out.println(STR."The Number of words are:\{c}");

    }

    public static int countwords(String s2 )
    {
        int count = 0;
        if (s2.charAt(0)!=' ')
        {
            count++;
        }
        for (int i = 0; i <s2.length() ; i++)
        {
            if (s2.charAt(i) == ' ' && s2.charAt(i+1) != ' ' )
            {
                count++;
            }

        }
        return count;
    }
}
