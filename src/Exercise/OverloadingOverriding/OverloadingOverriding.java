package Exercise.OverloadingOverriding;

public class OverloadingOverriding {
    public static void main(String[] args) {
        Adder ad = new Adder();
        System.out.println(Adder.add(10,20));
        System.out.println(Adder.add(10,20,30));
        Adder obj = new Adder();
        obj.show();
    }
}
class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    void show(){
        System.out.println("print statement from Adder class");
    }
}
class Printable extends Adder{
    void show(){
        System.out.println("print statement from Printable class");
    }


}

