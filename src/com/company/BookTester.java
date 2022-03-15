package com.company;

import java.util.ArrayList;

public class  BookTester {
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

        myLibrary.add(book2);

        BookListing c = new BookListing(book1, 10.99);

        BookListing d = new BookListing(book2, 12.99);

        c.printDescription();
        System.out.println("");
        d.printDescription();
    }


}
