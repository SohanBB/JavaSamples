package com.company.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Arrylist {
    public static void main(String[] args) {
        ArrayList<String > name = new ArrayList<>();
        name.add("ABBY");
        name.add("BILL");
        name.add("ELA");
        name.add("JACK");
        System.out.println("Index of ABBY" + name.indexOf("ABBY"));
        System.out.println("ArrayList: " + name);
        System.out.println("REMOVE: " + name.remove(0));
        System.out.println(name);
        System.out.println("Size of list: " + name.size());
        System.out.println(name.iterator());


    }
}
