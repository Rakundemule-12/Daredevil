package org.example.ex_selenium;

public class FInd_Duplicate {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,4,5,6,7,7,8,9};
        System.out.println("The Duplicate Elements are:");
        for (int i = 0; i <a.length-1 ; i++)
        {
            if (a[i]==a[i+1])
            {
                System.out.println(STR."\{a[i]} found at index \{i}");
            }

        }
    }
}
