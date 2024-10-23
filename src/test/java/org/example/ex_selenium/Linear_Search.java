package org.example.ex_selenium;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args)
    {
        int [] a = {34,56,78,98,76,101,45,28,18,88};
        System.out.println("Enter The Number to be searched:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
//      boolean found = false;
        int count = 0;

        for (int i = 0; i <a.length ; i++)
        {
            if (num==a[i])
            {
                System.out.println("The Given Number "+num+" is found at index:"+i);
//              found = true;
                count++;
                break;
            }

        }

        if (count==0)
        {
            System.out.println("The Number is no where to be found");
        }
    }
}
