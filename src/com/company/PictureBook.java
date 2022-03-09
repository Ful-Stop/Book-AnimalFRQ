package com.company;

public class PictureBook extends Book{

    private String illustrator;

    public PictureBook(String t, String a, String il){
        super(t, a);
        illustrator = il;
    }

    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }

}

