package Exercise.LambdaExpre8;

public class Dog implements Printable {
    public String name;
    public int age;

    public Dog (){}

    @Override
    public void print() {
        System.out.println("This is dog class print method is defined in Printable Interface");
    }
}
