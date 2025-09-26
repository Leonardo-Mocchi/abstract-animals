package org.lessons.java.abstract_classes;

public class Aquila extends Uccelli implements IVolante {

    @Override
    public void mangia() {
        System.out.println("L'aquila si ciba primariamente di piccoli animali");
    }

    @Override
    public void verso() {
        System.out.println("'FORTE FISCHIO'");
    }

    /*
     * @Override
     * public void vola() {
     * System.out.println("Sto volando!!!");
     * }
     */
}
