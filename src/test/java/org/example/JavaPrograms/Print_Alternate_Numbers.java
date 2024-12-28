package org.example.JavaPrograms;

public class Print_Alternate_Numbers {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15};

        for (int i = 0; i < a.length; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }

        }

    }
}

