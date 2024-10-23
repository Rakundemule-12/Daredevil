package org.example.ex_selenium;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int balance= 2000000, withdraw, deposit;
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int c = s.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Enter money to withdraw");
                    withdraw = s.nextInt();
                    if (balance>=withdraw)
                    {
                        balance = balance-withdraw;
                        int w = withdraw;
                        System.out.println("The money withdrawn is:"+w);
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficent Balance");
                    }
                    break;

                case 2:
                    System.out.println("Enter money to be deposited");
                    deposit = s.nextInt();
                    
                        balance = balance+ deposit;
                        System.out.println("Please collect your money");
                   
                    break;

                case 3:
                    System.out.println("The Balance is:"+balance);
                    break;

                case 4:
                    System.exit(0);
            }


        }

    }
}
