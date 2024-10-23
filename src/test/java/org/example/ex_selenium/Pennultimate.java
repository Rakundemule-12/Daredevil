package org.example.ex_selenium;

public class Pennultimate {
    public static void main(String[] args) {
        String s = "My Name is great Ashoka";
        String [] a = s.split(" ");
        int size = a.length;
        if(a.length>0)
        {
            System.out.println(STR."The Penultimate word is: \{a[size - 2]}");
        }

        else
        {
            System.out.println("The given word is not a penultimate");
        }

    }
}
