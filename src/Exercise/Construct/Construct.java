package Exercise.Construct;

public class Construct {
    public static void main(String[] args) {
        Master ms = new Master("Pink");

    }
}
class Master{
    private String name ;
    Master(String color){
        name=color;
        System.out.println("Constructor called"+" Color is "+name);
    }
}
