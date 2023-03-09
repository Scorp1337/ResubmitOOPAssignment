package org.example;


import java.util.ArrayList;
import java.util.List;

import static org.example.Book.printBooks;


public class App {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();

        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        printBooks(books);
        System.out.println();

        ArtAlbum artAlbum1 = new ArtAlbum("Blank canvas", 177, 7);
        ArtAlbum artAlbum2 = new ArtAlbum("Unchained", 100, 5);
        ArtAlbum artAlbum3 = new ArtAlbum("Atmosphere", 255, 10);

        artAlbum1.addBooks("Blank canvas", 177);
        System.out.println(artAlbum1.getPaperQuality());
        artAlbum2.addBooks("Unchained", 100);
        artAlbum3.addBooks("Atmosphere", 255);


        System.out.println();

        Novel novel1 = new Novel("Don Quixote", 300, "Adventure");
        Novel novel2 = new Novel("Baltagul", 250, "Crime");
        Novel novel3 = new Novel("Lord of the rings", 355, "Science Fiction");

        novel1.addBooks("Don Quixote", 300);
        novel2.addBooks("Baltagul", 250);
        novel3.addBooks("Lord of the rings", 355);


        System.out.println();

        novel1.deleteBook();
        artAlbum2.deleteBook();

    }


}
