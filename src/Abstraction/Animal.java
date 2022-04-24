package Abstraction;

public abstract class Animal {
    String name  ;
    public abstract void print();
    public void printName(){
        System.out.println("Class name is : "+name);
    }
}
