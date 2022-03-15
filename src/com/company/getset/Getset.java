package com.company.getset;

public class Getset {
    private String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Getset object = new Getset();
        Getset object1 = new Getset();
        object.setName("JAVA");
        object1.setName("PYTHON");
        System.out.println(object.getName());
        System.out.println(object1.getName());
    }
}
