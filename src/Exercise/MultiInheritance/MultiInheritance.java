package Exercise.MultiInheritance;

public class MultiInheritance {
    public static void main(String[] args) {
        GrandParent gp = new GrandParent();
        gp.display();
        GrandChild gc = new GrandChild();
        gc.display();
        Child cc = new Child();
        cc.show();
    }

}
