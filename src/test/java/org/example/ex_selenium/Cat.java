package org.example.ex_selenium;

public class Cat {

    private String name="dsdsd";
    private int age=25;

    // Default constructor
//    public Cat() {
//        // Initialize name to "Unknown"
//        this.name = "Unknown";
//        // Initialize age to 0
//        this.age = 0;
//    }


    // Main method to test the Cat class
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();
        // Print the values of the instance variables
        System.out.println(STR."Cat's Name: \{myCat.name}");
        System.out.println(STR."Cat's Age: \{myCat.age}");
    }
}

