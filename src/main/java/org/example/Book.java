package org.example;

import java.util.List;

public class Book {

    public String name;
    public int numberOfPages;


    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ']';
    }

    public void addBooks(String typeOfBook) {


        System.out.println("You added a book of type: " + typeOfBook);


    }

    public void deleteBook() {
        this.name = null;
        System.out.println("Book deleted " + this.name);
    }

    public static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);

        }
    }
}
