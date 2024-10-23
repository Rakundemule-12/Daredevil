package org.example.ex_selenium;

public class Prime {
    public static void main(String[] args)
    {
        for (int i = 0; i <5 ; i++)
        {
            int l = 65;
            for (int j = 0; j <=i ; j++)
            {
                System.out.print((char) (l+i));
                System.out.print(" ");

            }
            System.out.println();

        }

    }
}
