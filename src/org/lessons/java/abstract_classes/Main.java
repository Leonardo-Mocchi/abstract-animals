package org.lessons.java.abstract_classes;

public class Main {

    public static void faiVolare(IVolante animaleVolante) {
        animaleVolante.vola();
    }

    public static void faiNuotare(INuotante animaleNuotante) {
        animaleNuotante.nuota();
    }

    public static void main(String[] args) {

        System.out.println("\nCane");
        Cane Volpino = new Cane();

        Volpino.dormi();
        Volpino.verso();
        Volpino.mangia();
        Volpino.mostraDentiCaniniSviluppati();

        System.out.println("\nPasserotto");
        Passerotto passerotto = new Passerotto();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);

        System.out.println("\nAquila");
        Aquila aquila = new Aquila();

        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);

        System.out.println("\nDelfino");
        Delfino delfino = new Delfino();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        delfino.geyserSfiatatoio();
        faiNuotare(delfino);
    }
}
