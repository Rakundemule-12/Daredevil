package org.example.ex_selenium;

public class Left_Tr {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=2*(5-i) ; j++)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" *");

            }
            System.out.println();

        }
    }
}
