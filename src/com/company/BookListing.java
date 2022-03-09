package com.company;

public class BookListing {

    private Book book;
    private double price;

    public BookListing(Book b, double p){
        b = book;
        p = price;
    }

    public void printDescription(){
        book.printBookInfo();
        System.out.print(", $" + price);
    }
}
