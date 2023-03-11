package org.example;


import java.util.Iterator;
import java.util.List;

public class LibraryCatalog {

    public List<Book> books;

    public LibraryCatalog(List<Book> books) {
        this.books = books;
    }


    public static void addBook(Book book, String typeOfBook) {

        System.out.println("Book added " + book.getName() + typeOfBook);

    }

    public static void  deleteBook(Book book) {

        book.name = null;
        System.out.println("Book deleted! ");

    }

    public static void printingBooks(List<Book> books) {

        Iterator<Book> bookIterator = books.iterator();

        while (bookIterator.hasNext()) {
            Book nextBook = bookIterator.next();
            System.out.print("Book name [");
            System.out.print(nextBook.name);
            System.out.print(", ");
            System.out.print(nextBook.numberOfPages);
            System.out.print(" pages]");
            System.out.println();


        }

    }
}





