package Tutorial.AblockingQ;
import java.util.concurrent.ArrayBlockingQueue;

public class AblockingQ {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> Car = new ArrayBlockingQueue<>(4);
        try {
            Car.add("Driver");
            Car.add("Passneger1");
            Car.add("Passenger2");
            Car.add("Passenger3");
            Car.add("Passenger4");
        }
        catch (Exception e){
            System.out.println("Space is Full : " + e);
        }
    }
}
