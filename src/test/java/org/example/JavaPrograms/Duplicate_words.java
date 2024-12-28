package org.example.JavaPrograms;

public class Duplicate_words {
    public static void main(String[] args) {
        String s = "Big black bug bit a big black dog on his big black nose";
        s = s.toLowerCase();
        String [] a = s.split(" ");
        int count = 0;
        int i;

        System.out.println("The Duplicate Strings are:");
        for (i = 0; i <a.length ; i++)
        {
            if (a[i].equals("0"))
            {
                continue;
            }
            count = 1;
            for (int j = i+1; j <a.length ; j++)
            {
                if (a[i].equals(a[j]))
                {
                    count++;
                    a[j] = "0";
                }

            }
            if (count>1)
            {
                System.out.println(a[i]);
            }

        }

    }
}
