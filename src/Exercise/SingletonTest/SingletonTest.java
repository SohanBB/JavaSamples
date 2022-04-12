package Exercise.SingletonTest;

public class SingletonTest {
    public static void main(String[] args) {
        Animal animal = Animal.getInstance();
        System.out.println(animal.a);


}}
class Animal{
    static Animal intence = null;
    public String a= "SingletonClass";
    private Animal(){}
    static public Animal getInstance(){
        if(intence==null)
            intence=new Animal();
        return intence;

    }

}