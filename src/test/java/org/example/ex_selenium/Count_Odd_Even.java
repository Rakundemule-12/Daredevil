package org.example.ex_selenium;

import java.util.Scanner;

public class Count_Odd_Even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Please Enter the Number:");
        int num = s.nextInt();
        int onum = num;
        int e=0,o=0;
        while (onum>0)
        {
            int r = onum % 10;
            if (r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            onum = onum / 10;

        }
        System.out.println(STR."In the Given Number"+num+ STR."count of Even Numbers are: \{e}");
        System.out.println(STR."In the Given Number"+num+ STR."count of Odd Numbers are: \{o}");
    }
}
