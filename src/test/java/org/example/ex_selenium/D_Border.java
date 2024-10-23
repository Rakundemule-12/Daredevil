package org.example.ex_selenium;

public class D_Border {
    public static void main(String[] args)
    {
        for (int i = 0; i <5 ; i++)
        {
            for (int j = 5 - i; j > 1; j--)
            {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++)
            {
                int l = 65;
                if (k==0 || k==i) {
                    System.out.print((char) (l + i));
                    System.out.print(" ");
                }
                else{
                    System.out.print(" "+" ");
                }


            }
            System.out.println();
        }

            for (int i = 3; i>=0 ; i--)
            {
                for (int j = 3-i; j >=0 ; j--)
                {
                    System.out.print(" ");

                }
                for (int k = 0; k <=i ; k++)
                {
                    int l =65;
                    System.out.print((char) (l+i));
                    System.out.print(" ");

                }
                System.out.println(" ");


            }
        }
    }

