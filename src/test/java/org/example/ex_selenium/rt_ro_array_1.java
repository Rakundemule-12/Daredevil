package org.example.ex_selenium;

import java.util.Arrays;

public class rt_ro_array_1 {
    public static void main(String[] args)
    {
        int [] a = {4,6,7,8,9,10};
        int b = a[a.length-1];
        int s = a.length;

        for (int i = s-1; i > 0 ; i--)   // 4,6,7,8,9
        {                                // a[5] = 9,a[4]= 8,a[3] = 7,a[2]= 6,a[1]= 4, a[0]= 10
            a[i]= a[i-1];

        }
        a[0] = b;
        System.out.println(STR."The reversed array elements are: \{Arrays.toString(a)}");

    }
}
