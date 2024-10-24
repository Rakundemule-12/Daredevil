package org.example.JavaPrograms;

public class L_Ro_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
//                 0  1  2  3  4  5  6  7
        for (int j = 0; j < a.length; j++)
        {
            int b = a[0];

            for (int i = 0; i < a.length - 1; i++)
            {
                a[i] = a[i + 1];

            }
            a[a.length - 1] = b;
        }
//
//            System.out.println(Arrays.toString(a));
//        }
//         if (j%2!=0)
//         {
//             System.out.print(a[j]);
//             System.out.print(" ");
//         }

    }
}

