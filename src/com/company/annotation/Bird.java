package com.company.annotation;


public class Bird {
    public void display(){
        System.out.println("This is class Bird: ");
    }
}
class Parrot extends Bird {
    @Override
    public void display(){
        System.out.println("This is Parrot class: ");
        super.display();
    }

}