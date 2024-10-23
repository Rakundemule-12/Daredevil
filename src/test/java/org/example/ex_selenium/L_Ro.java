package org.example.ex_selenium;

public class L_Ro {
    public static void main(String[] args) {
        String a = "Keerti";
        char [] b = a.toCharArray();


        for (int i = 0; i <3 ; i++) {
            char c = b[0];
            for (int j = 0; j < b.length - 1; j++)
            {
                b[j] = b[j + 1];

            }
            b[b.length-1] = c;
        }



        System.out.println();
        System.out.println("After right rotating the result is:");
        System.out.println(b);
    }
}
