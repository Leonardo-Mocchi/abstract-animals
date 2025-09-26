package org.lessons.java.abstract_classes;

public class Delfino extends Cetacei implements INuotante {
    @Override
    public void verso() {
        System.out.println("'fischi e click'");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesci e calamari");
    }

    /*
     * @Override
     * public void nuota() {
     * System.out.println("Sto nuotando!!!");
     * }
     */

    @Override
    public void geyserSfiatatoio() {
        System.out.println("'KSHHHHH!'");
    }
}
