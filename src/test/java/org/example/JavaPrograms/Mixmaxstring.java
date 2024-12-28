package org.example.JavaPrograms;

public class Mixmaxstring {
    public static void main(String[] args) {
        String a = "Hardships often prepare ordinary people for a extraordinary destiny";
        String min = "", max="";
        String [] b = a.split(" ");
        int i;
        min = b[0];
        max = b[0];

        for (i = 0; i <b.length ; i++)
        {

            if (min.length() > b[i].length())
            {
                min = b[i];
            }
            else if (max.length() < b[i].length())
            {
                max = b[i];
            }

        }
        System.out.println("The minimum String is: "+min);
        System.out.println("The maximum String is: "+max);
    }
}
