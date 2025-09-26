package org.lessons.java.abstract_classes;

public interface IVolante {
    default public void vola() {
        System.out.println("Sto volando!!!");
    }
}
