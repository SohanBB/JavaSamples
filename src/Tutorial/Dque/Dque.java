package Tutorial.Dque;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class Dque {
    public static void main(String[] args) {
        ArrayDeque<String> Bus = new ArrayDeque<>();
        Bus.add("Passenger2");
        Bus.addFirst("Passenger1");
        Bus.addLast("Passenger3");
        Bus.offerLast("Passenger4");
        System.out.println("Bus contains: " + Bus );
        String first = Bus.peekFirst();
        System.out.println("First passenger is: " + first);
        String last = Bus.getLast();
        System.out.println("Last passenger is : " + last);
        String fremove = Bus.remove();
        System.out.println("\n First element removed is: " + fremove);
        String lpoll = Bus.pollLast();
        System.out.println("Last element poll : " + lpoll);
        System.out.println("Iterate : ");
        for (String bus : Bus) {
            System.out.print(bus);
            System.out.print(",");
        }
         System.out.println("\n ArrayDeque in reverse order : ");
         Iterator <String> desIterate = Bus.descendingIterator();
         while (desIterate.hasNext()){
             for (String s : Arrays.asList(desIterate.next(), ",")) {
                 System.out.print(s);
             }
         }
         Bus.push("Passenger5");
         Bus.push("Passenger6");
         System.out.println("\n BUS using Stack Operation: " + Bus);

    }
}
