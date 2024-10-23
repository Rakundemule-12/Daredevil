package org.example.ex_selenium;

public class Upper_Lower {
    public static void main(String[] args) {
        String s = "Hello Word PLease COMEin";
        System.out.println(STR."String before Conversion: \{s}");
        String toggled = toggledstring(s);
        System.out.println(STR."The Toggled String is: \{toggled}");
    }

    public static String toggledstring(String word)
    {
        StringBuilder result = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++)
        {
            if (Character.isUpperCase(word.charAt(i)))
            {
                result.append(Character.toLowerCase(word.charAt(i)));
            }
            else if (Character.isLowerCase(word.charAt(i)))
            {
                result.append(Character.toUpperCase(word.charAt(i)));
            }
            else
            {
                    result.append(word.charAt(i));

            }

        }
        return result.toString();
    }
}
