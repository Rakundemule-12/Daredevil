package org.example.JavaPrograms;

import java.util.Scanner;

public class Min_MaxString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the string");
        String a = s.nextLine();
        reading(a);

    }


    public static void reading(String b) {
        String[] words = b.split(" ");
        String min = "";
        String max = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                min = words[0];
                max = words[0];

            } else if (words[i].length() < min.length()) {
                min = words[i];
            } else if (words[i].length() > max.length()) {
                max = words[i];
            }

        }
        System.out.println("The Minimum String is: " + min);
        System.out.println("The Maximum String is: " + max);

    }
}


