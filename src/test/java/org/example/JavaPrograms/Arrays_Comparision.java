package org.example.JavaPrograms;

public class Arrays_Comparision {
    public static void main(String[] args)
    {
        int [] a = {12,13,14,15,16,21,18};
        int [] b = {12,13,14,15,16,17,18};
        boolean c= true;

        if (a.length==b.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] != b[i])
                {
                    c = false;
                    break;
                }
            }
        }

                else
                {
                    c = false;

                }
                if (c)
                {
                    System.out.println("Both are Equal");
                }
                else
                {
                    System.out.println("The given array are not equal");
                }

            }

        }


