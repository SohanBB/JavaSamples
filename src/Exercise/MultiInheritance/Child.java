package Exercise.MultiInheritance;

public class Child extends Parent{
    void display(){
        System.out.println("This is Child class");
        super.display();
    }
    void show (){
        System.out.println("Show method in Child class");
    }
}
