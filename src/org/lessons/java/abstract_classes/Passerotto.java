package org.lessons.java.abstract_classes;

public class Passerotto extends Uccelli implements IVolante {

    @Override
    public void mangia() {
        System.out.println("Il passerotto si nutre principalmente di grano");
    }

    @Override
    public void verso() {
        System.out.println("'small chip chip'");
    }

    /*
     * @Override
     * public void vola() {
     * System.out.println("Sto volando!!!");
     * }
     */
}
