package Tutorial.AbsClass;

public class Cat extends Animal  implements AnimalStuff{

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void hair() {
        System.out.println("Cat Hairs");
    }
}
