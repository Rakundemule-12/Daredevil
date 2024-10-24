package org.example.JavaPrograms;

import java.util.Scanner;

public class Fst_Occurance {
    public static void main(String[] args) {
        int [] a = {4,5,5,6,6,7,8,9,9,10,23,24,23,23,4,10};
        System.out.println("Please Enter the number to find its Occurance:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean f = false;
        for (int i = 0; i <a.length ; i++)
        {
            if (num==a[i])
            {
                System.out.println("The Given Number "+num+" is found at index "+i);
                f = true;
                break;
            }

        }
        if (!f)
        {
            System.out.println("The Given Number "+num+" cannot be found at index");
        }
    }
}
