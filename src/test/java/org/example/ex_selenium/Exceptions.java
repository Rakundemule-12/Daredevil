package org.example.ex_selenium;

public class Exceptions {
    public static void main(String[] args) {
//        int a = 100;
//        int b = 0;
//        int c=0;
//
//        try {
//
//
//             c = a / 0;
//
//        }
//
//        catch (ArithmeticException e)
//        {
//            System.out.println("Divide by zero Error");
//        }
//
//
//        System.out.println("----------");
//        try {
//
//            int[] a = new int[5];
//            System.out.println(a[10]);
//
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
////            System.out.println("Do not access the Out of bond array");
//            System.out.println(e);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Default Exception");
//        }
//        System.out.println("Write a Happy Program");
//        try{
//            int a[]=new int[5];
//            a[5]=30/0;
//        }
//        catch(Exception e){System.out.println("common task completed");}
//        catch(ArithmeticException e){System.out.println("task1 is completed");}
//        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
//        System.out.println("rest of the code...");

        try{
            //inner try block 1
            try{
                System.out.println("going to divide by 0");
                int b =39/0;
            }
            //catch block of inner try block 1
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }


            //inner try block 2
            try{
                int[] a =new int[5];

                //assigning the value out of array bounds
                a[5]=4;
            }

            //catch block of inner try block 2
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }


            System.out.println("other statement");
        }
        //catch block of outer try block
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }
        finally
        {
            System.out.println("Finally always executed");
            System.out.println("--------!!!!!!---------");
        }

        System.out.println("normal flow..");
    }
    }


