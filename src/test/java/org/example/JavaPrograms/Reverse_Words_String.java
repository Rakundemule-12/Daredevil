package org.example.JavaPrograms;

import java.util.Scanner;

public class Reverse_Words_String {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the String to Divide: ");
        String str = s.nextLine();
        System.out.println("Please Enter the number to Divide: ");
        int n = s.nextInt();


        int n1 = str.length()/n;
        String s1;

        if (str.length()%n ==0)
        {
            for (int i = 0; i < n; i++) {
                s1="";
                for (int j = n1*i; j < (i + 1) * n1; j++)
                {
                    s1 = s1 + str.charAt(j);

                }
                System.out.println(s1);
            }

        }
        else
        {
            System.out.println("Sorry the String cant be divided");
        }


    }
}
