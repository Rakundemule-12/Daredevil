package org.example.JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Sumof_Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the String to find the duplicates:");
        String a = s.nextLine();
        char[] b = a.toCharArray();
        Arrays.sort(b);

        System.out.println("The Duplicate Characters are:");
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == b[i + 1]) {
                System.out.println(b[i]);
            }
            while (i < b.length - 1 && b[i] == b[i + 1]) {
                i++;

            }

        }
    }
}
