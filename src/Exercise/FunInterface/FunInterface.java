package Exercise.FunInterface;

public class FunInterface  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
        showing(()-> System.out.println("* Lambada Expression *"));

    }
    static void showing (PrintInterface show){
        show.print();
    }

}
