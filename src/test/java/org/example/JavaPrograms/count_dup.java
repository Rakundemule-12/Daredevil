package org.example.JavaPrograms;

public class count_dup {
    public static void main(String[] args) {
        String string1 = "Great responsibility";
        int i, j;
        int[] f = new int[string1.length()];
        char[] a = string1.toCharArray();

        for (i = 0; i < a.length; i++) {
            f[i] = 1;
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    f[i]++;
                    a[j] = 0;
                }

            }

        }

        System.out.println("The Frequency of the Characters are:");
        for (i = 0; i < f.length; i++) {
            if (a[i] != ' ' && a[i] != 0) {
                System.out.println(a[i] + " : " + f[i]);

            }

        }
    }

}