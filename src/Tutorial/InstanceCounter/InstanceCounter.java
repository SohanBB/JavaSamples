package Tutorial.InstanceCounter;

public class InstanceCounter {

    static int counter =0;
    {
        counter = +1;
    }
    public InstanceCounter(){
    }
    public InstanceCounter(int a){
    }
    public InstanceCounter(String str){
    }
    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter(10);
        InstanceCounter obj3 = new InstanceCounter("Hello");
        System.out.println(InstanceCounter.counter);
    }
}
