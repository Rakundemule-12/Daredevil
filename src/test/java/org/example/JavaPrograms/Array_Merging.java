package org.example.JavaPrograms;

import java.util.Arrays;

public class Array_Merging {
    public static void main(String[] args) {
        int [] a = {5,7,10,11,12,13,14,15};
        int [] b = {2,4,6,8,19};
        int as = a.length;
        int bs = b.length;
        int [] c = new int[as+bs];
        int i=0, j=0, k=0;

        while (i<as && j<bs)
        {
          if (a[i]<=b[j])
          {
              c[k] = a[i];
              i++;
              k++;
          }
          else
          {
            c[k] = b[j];
            j++;
            k++;
          }
        }
        while (i<as)
        {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j<bs)
        {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println("The Elements of c after Sorting are:");
        System.out.println(Arrays.toString(c));
    }
}
