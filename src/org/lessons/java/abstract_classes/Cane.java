package org.lessons.java.abstract_classes;

public class Cane extends Canide {

    @Override
    public void verso() {
        System.out.println("'Woof!'");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia prevalentemente carne");
    }

    @Override
    public void mostraDentiCaniniSviluppati() {
        System.out.println("GRRR!");
    }

}
