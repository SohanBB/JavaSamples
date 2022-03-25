package Tutorial.Priority;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>(new Custom());
        num.add(7);
        num.add(4);
        num.add(9);
        num.add(1);
        System.out.println("Priority Queue: "+ num);
        boolean rm = num.remove(2);
        System.out.println("IS element revomed " + rm);
        for (Integer integer : num) {
            System.out.print(integer);
            System.out.println(",");
        }

    }
}
class Custom implements Comparator <Integer>{
    public int compare(Integer num1,Integer num2){
        int value = num1.compareTo(num2);
        if (value > 0) return -1;
        else if (value < 0) return 1;
        else return 0;

    }
}