package org.example.ex_selenium;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int [] a = {3,4,4,5,6,6,7,7,11,11,12};  // 3,4,5,6,7,11,12,7,11,11,12
        int j = 0;
        for (int i = 0; i <a.length-1 ; i++)
        {
            if (a[i]!=a[i+1])
            {
              a[j] = a[i];
              j++;
            }

        }
        a[j]= a[a.length-1];
        System.out.println("The non duplicate array is:");
        for (int k = 0; k <=j ; k++)
        {
            System.out.print(a[k]);
            System.out.print(" ");

        }
    }
}
