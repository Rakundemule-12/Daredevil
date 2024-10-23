package org.example.ex_selenium;

import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        int [] a = {12,4,6,8,23,1,2};
        int temp = 0;

        System.out.println("Before Soring in ascending elemnets are: "+ Arrays.toString(a));
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = i+1; j <a.length ; j++)
            {
                if (a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println("Elemnts after sorting in ascending order are: "+ Arrays.toString(a));

    }
}
