package com.company;

public class Animal {

    private String foodSource;
    private String species;
    private String name;

    public Animal(String f, String s, String n){
        foodSource = f;
        species = s;
        name = n;
    }

    public void toStringAnimal(){
        System.out.print(name + " the " + species + " is a " + foodSource);
    }
}
