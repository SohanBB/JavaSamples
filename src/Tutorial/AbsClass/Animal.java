package Tutorial.AbsClass;

public abstract class Animal {
    int age;
    String name;
    public abstract void makeNoise();
    //make sure every extended class has makeNoise method
    //can't create object of animal class
}
