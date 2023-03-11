package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.LibraryCatalog.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();


        Book book1 = new Book("Harry Potter", 10);
        Book book2 = new Book("Lord of the rings", 20);
        Book book3 = new Book("Abstract", 30);

        Novel novel1 = new Novel("The Adventures of Huckleberry Finn", 225, "Adventure");
        Novel novel2 = new Novel("Moby Dick", 222, "Sea stories");
        Novel novel3 = new Novel("Les Miserables", 289, "Drama");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(novel1);
        books.add(novel2);
        printingBooks(books);

        System.out.println();
        addBook(book1, " Novel");
        addBook(book3, " Art Album");

        System.out.println();
        deleteBook(book3);
        printingBooks(books);


    }

}
