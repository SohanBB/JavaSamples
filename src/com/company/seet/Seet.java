package com.company.seet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Seet {
    public static void main(String[] args) {
        Set<Integer> even = new LinkedHashSet<Integer>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(4);
        System.out.println("SET IS : " + even);
    }

}
