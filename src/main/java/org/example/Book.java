package org.example;

import java.util.Iterator;
import java.util.List;

public class Book {

    public String name;
    public int numberOfPages;



    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ']';
    }

    public void addBooks(String name) {


        System.out.println("Book " + name + " added.");

    }

    public void deleteBook (){
        this.name =null;
        System.out.println("Book has been deleted.");
    }
    public static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);

        }
    }
}
