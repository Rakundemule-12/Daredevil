package org.example.JavaPrograms;

public class Swap_Strings {
    public static void main(String[] args) {
       String a = "PeeraPeera";
       String b = "Keera";

       a = a+b;                                //PeeraPeeraKeera
       b = a.substring(0,a.length()-b.length()); //
       a = a.substring(b.length());

        System.out.println("After Swapping a is: "+a);
        System.out.println("After Swapping b is: "+b);

    }
}
