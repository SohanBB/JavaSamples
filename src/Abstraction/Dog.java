package Abstraction;

public class Dog extends  Animal{
    String name;
    @Override
    public void print() {
        System.out.println("This is Dog class extended from Animal") ;
    }
}
