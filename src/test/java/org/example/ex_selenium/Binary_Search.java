package org.example.ex_selenium;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args)
    {

        int [] a = {12,13,14,15,16,17,18,19,20};
        System.out.println();
        System.out.println("Please Enter the number to search:");
        Scanner s = new Scanner(System.in);
        int searchnum = s.nextInt();
        int low =0;
        int high = a.length-1;
        int mid = 0;
        while (low<=high)
        {
            mid= (low+high)/2;
            if (searchnum==a[mid])
            {
                System.out.println(STR."The Given number \{searchnum} is found at index: \{mid}");
                break;
            }
            else if (searchnum < a[mid])
            {
                high = mid-1;
            }
            else if (searchnum > a[mid])
            {
             low = mid+1;
            }
        }
        if (low>high)
        {
            System.out.println("The Given Number is No where to be found in an array");
        }


    }
}
