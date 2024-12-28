package org.example.JavaPrograms;

import java.util.Scanner;

public class Prime_Not {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Please Enter the Number:");
        int num = s.nextInt();
        boolean isp = true;
        if (num > 1)
        {
            for (int i = 2; i <num ; i++)
            {
                if (num%2==0)
                {
                    isp = false;
                }

            }
        }
        else
        {
            isp = false;
        }

        if (isp)
        {
            System.out.println("The given number is a prime number");
        }
        else
        {
            System.out.println("The given number is not a prime number");
        }

    }
}
