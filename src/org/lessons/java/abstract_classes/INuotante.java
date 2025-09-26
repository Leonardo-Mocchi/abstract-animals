package org.lessons.java.abstract_classes;

public interface INuotante {
    default public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
