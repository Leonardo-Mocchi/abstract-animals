package org.lessons.java.abstract_classes;

public interface INuotante {
    default void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
