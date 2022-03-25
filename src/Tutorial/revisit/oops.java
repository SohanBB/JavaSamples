package Tutorial.revisit;


public class oops extends Password{
    public static void main(String[] args) {
        oops op = new oops();
        op.method();
        Run r= new Run();
        r.name = " Peter";
        r.method();




    }
    }
    abstract class Password{
    String name ;
     public void method (){
         System.out.println("This is abstraction");

    }
    }
    class Run extends Password{
    public void method(){
        System.out.println("class abstraction child class"+name);
    }

    }