package org.example.JavaPrograms;

public class Bubby_Sort {
    public static void main(String[] args) {
        int [] a = {8,2,4,6,9,12,3,5};
        int temp=0;
        System.out.println();
        System.out.println("Before Sorting");
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");

        }
        System.out.println();

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

            }
        }
            System.out.println("Elements After Sorting are");
        for (int j : a) {
            System.out.print(j);
            System.out.print(" ");

        }

        }
    }

