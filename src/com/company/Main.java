package com.company;

public class Main {
    String pName;
     Main (String name){
        pName = name;
        System.out.println("Hello " + pName );
    }

    public static void main(String[] args) {
	Main obj0 = new Main("jack");
    Main obj1 = new Main("Peter");
    Main obj2 = new Main("Tina");
    }
}
