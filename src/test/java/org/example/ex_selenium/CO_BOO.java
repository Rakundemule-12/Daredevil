package org.example.ex_selenium;

import java.util.LinkedList;
import java.util.Scanner;

public class CO_BOO {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the book Name");
        String Name = s.nextLine();

        System.out.println("Please Enter the Author Name");
        String AN = s.nextLine();

        System.out.println("Please Enter Cost of the Book");
        Integer book = s.nextInt();

        Book b1 = new Book(Name,AN,book);

        l1.add(b1);
        System.out.println("The book Details are");
        System.out.println(l1);
//        for (int i = 0; i <l1.size() ; i++)
//        {
//            System.out.println(l1.get(i));
//
//        }
    }
}

class Book
{
    String Book_Name;
    String Author_Name;
    Integer cost;

    public Book(String book_Name, String author_Name, Integer cost)
    {
        Book_Name = book_Name;
        Author_Name = author_Name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book_Name='" + Book_Name + '\'' +
                ", Author_Name='" + Author_Name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
