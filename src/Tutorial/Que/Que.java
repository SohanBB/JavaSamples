package Tutorial.Que;
import java.util.Queue;
import java.util.LinkedList;


public class Que {
    public static void main(String[] args) {
      Queue<String> numbers = new LinkedList<>();
      numbers.offer("Three");
      numbers.offer("FIVE");
      numbers.offer("Four");
      numbers.offer("Seven");
      System.out.println("QUEUE : " + numbers);
      boolean result = numbers.isEmpty();
      System.out.println("Is queue empty: "+ result);
      String access = numbers.peek();
      System.out.println("Accessible Element : " + access);
     String remove = numbers.poll();
     System.out.println("Removed element: " + remove);
     System.out.println("Updated Queue: "+ numbers);
    }
}
