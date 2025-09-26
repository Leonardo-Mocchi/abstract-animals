package org.lessons.java.abstract_classes;

public interface IVolante {
    default void vola() {
        System.out.println("Sto volando!!!");
    }
}
