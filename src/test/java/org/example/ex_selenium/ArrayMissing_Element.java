package org.example.ex_selenium;

public class ArrayMissing_Element {
    public static void main(String[] args) {
        int [] a = {11,12,13,15,16,17,18,19};
        int c = 0;
        int b = 0;

        for (int i = 0; i <a.length ; i++)
        {
            c = c + a[i];

        }

        for (int i = 11; i < 20 ; i++)
        {
            b = b + i;

        }

        int d = b - c;

        System.out.println("The Missing Element in an array is "+d);
    }
}
