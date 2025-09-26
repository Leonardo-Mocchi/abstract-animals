package org.lessons.java.abstract_classes;

public class Main {

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {

        System.out.println();

        Cane Volpino = new Cane();

        Volpino.dormi();
        Volpino.verso();
        Volpino.mangia();
        Volpino.mostraDentiCaniniSviluppati();

        System.out.println();

        Passerotto passerotto = new Passerotto();
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);

        System.out.println();

        Aquila aquila = new Aquila();
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);

        System.out.println();

        Delfino delfino = new Delfino();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        delfino.geyserSfiatatoio();
        faiNuotare(delfino);
    }
}
