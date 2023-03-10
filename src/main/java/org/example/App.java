package org.example;


import java.util.ArrayList;
import java.util.List;

import static org.example.Book.printBooks;


public class App {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();


        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        printBooks(books);
        System.out.println();


        book1.addBooks("Novel");
        book1.addBooks("Art Album");
        book1.addBooks("Encyclopedia");

        System.out.println();

        book1.deleteBook();
        book2.deleteBook();










        System.out.println();



    }


}
