package Tutorial.AtoQ;
import java.util.ArrayList;
import java.util.List;

public class AtoQ {

    List<String> people;

    public AtoQ() {

        this.people = new ArrayList<>();
    }

    public void queue(String person) {

        this.people.add(person);
    }

    public String dequeue() throws Exception {
        if (this.people.size() > 0) {
            return this.people.remove(0);
        }
        throw new Exception("Can't dequeue from empty queue");
    }

    public String[] toArray() {
        return people.toArray(new String[0]);
    }

    public static void main(String[] args) {
        AtoQ atoq = new AtoQ();
        atoq.queue("sachin");
        atoq.queue("sohan");
        atoq.queue("shubham");
        atoq.queue("akshay");
        String [] array = atoq.toArray();;
        System.out.println(array);


//        try {
//            System.out.println(atoq.dequeue());
//            System.out.println(atoq.dequeue());
//            System.out.println(atoq.dequeue());
//            System.out.println(atoq.dequeue());
//            System.out.println(atoq.dequeue());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
