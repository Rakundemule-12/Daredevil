package org.example.ex_selenium;

public class Alhabet {
    public static void main(String[] args) {
        int letter = 65;

        for (int i = 0; i <= 4; i++)
        {
            for (int j = 0; j <= i; j++) {

                System.out.print((char) (letter+i));
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
