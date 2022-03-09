package com.company;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        Book a = new Book("Jim", "Jimbo");
        PictureBook b = new PictureBook("Tim", "Timmy", "Timothy");

        a.printBookInfo();

        System.out.println("");

        b.printBookInfo();

        System.out.println("");

        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);

        System.out.println("");

        myLibrary.add(book2);

        System.out.println("");

        BookListing c = new BookListing(book1, 11.99);

        c.printDescription();
    }


}
