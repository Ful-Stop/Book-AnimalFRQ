package com.company;

public class AnimalPrint {
    public static void main(String[] args) {
        Animal animal1 = new Animal("piscivore", "penguin", "jerry");
        animal1.toStringAnimal();

        System.out.println("");

        Herbivore herbivore1 = new Herbivore("mice", "barry");
        herbivore1.toStringAnimal();

        System.out.println("");

        Elephant elephant1 = new Elephant("joe", 14.2);
        elephant1.toStringElephant();
    }
}
