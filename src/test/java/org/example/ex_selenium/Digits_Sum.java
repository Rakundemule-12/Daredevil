package org.example.ex_selenium;

public class Digits_Sum {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Please Enter the Digit");
//        int num = s.nextInt();
        int [] a = {4,5,6,7,8,9};
          int sum = 0;
//        while (num>0)
//        {
//            int r = num % 10;         // 121
//            sum = sum + r;            // 1+2+1
//            num = num / 10;
//
//        }
        for (int i = 0; i <a.length ; i++)
        {
            sum = sum + a[i];

        }
        System.out.println("The Sum of Digits is: "+sum);
    }
}
