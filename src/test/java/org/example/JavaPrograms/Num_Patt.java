package org.example.JavaPrograms;

public class Num_Patt {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <=5 ; i++)
        {

            for (int j = 1; j <=i ; j++)
            {
                System.out.print(c);
                System.out.print(" ");
                c++;
            }

            System.out.println(" ");

        }
    }
}
