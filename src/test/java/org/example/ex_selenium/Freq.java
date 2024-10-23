package org.example.ex_selenium;

public class Freq {
    public static void main(String[] args) {
        String a = "Where there is a will there is a way";
        int [] f = new int[a.length()];
        int i,j;
        char [] c = a.toCharArray();

        for (i=0;i<a.length();i++)
        {
           f[i] = 1;
            for (j = i+1; j <a.length() ; j++)
            {
                if (c[i]==c[j])
                {
                    f[i]++;
                    c[j]='0';
                }

            }

        }
        System.out.println("The frequencies of charas are:");
        for (i = 0; i <f.length ; i++)
        {
            if (c[i]!=' ' && c[i]!='0')
            {
                System.out.println(c[i]+"-"+f[i]);

             }

        }
    }
}
