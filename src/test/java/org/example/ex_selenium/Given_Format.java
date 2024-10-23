package org.example.ex_selenium;

public class Given_Format {
    public static void main(String[] args) {

        String a = "MOM MADAM";
        char [] b = a.toCharArray();
        String c = "";
        int count = 0;
        for (int i = b.length-1; i >=0 ; i--)
        {
            c= c + b[i];//aynanaA
            count++;

        }
        System.out.println(STR."Number of Words are: \{count}");
//
//       if (a.equals(c))
//       {
//           System.out.println("This is a palindrome");
//       }
//       else
//       {
//           System.out.println("Not a palindrome");
//       }

    }
}

