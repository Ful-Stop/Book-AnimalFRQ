package com.company;

public class Elephant extends Herbivore{

    private double tuskLength;

    public Elephant(String n, double tL){
        super("elephant", n);
        tuskLength = tL;
    }

    public void toStringElephant(){
        super.toStringAnimal();
        System.out.print(" with tusks " + tuskLength + " meters long");
    }
}
