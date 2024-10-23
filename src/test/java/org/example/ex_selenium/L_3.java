package org.example.ex_selenium;

public class L_3 {
    public static void main(String[] args){
        Bike2 obj = new Bike2();//creating object
        Vehicle b = new Vehicle();
        obj.run();//calling method
        b.run();
    }
}

    class Vehicle
    {
        //defining a method
        void run()
        {
            System.out.println("Vehicle is running");

        }
    }

    class Bike2 extends Vehicle
    {
    //defining the same method as in the parent class
    void run()
    {
        System.out.println("Bike is running safely");

    }


}








