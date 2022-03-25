package com.company.Vectr;

import java.util.Vector;

public class Vectr {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(15);
        vector.add(11);
        vector.add(3,17);
        System.out.println("Vector is : " + vector);
        int remove = vector.remove(2);

        System.out.println("Removed element: " + remove);
    }
}
