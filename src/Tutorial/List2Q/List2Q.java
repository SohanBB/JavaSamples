package Tutorial.List2Q;

import java.util.ArrayList;
import java.util.List;

public class List2Q {
    List<String>People;
    public List2Q (){
        this.People=new ArrayList<>();
    }
    public void queue(String Person){
        this.People.add(Person);
    }
    public String dequeue ()throws Exception{
        if(this.People.size()>0){
           return this.People.remove(0);
        }
        throw new Exception("Can't dequeue from empty Queue: ");
    }

    public static void main(String[] args) {
        List2Q list = new List2Q();
        list.queue("Sam");
        list.queue("Tim");
        list.queue("Kim");
        try {
            System.out.println(list.dequeue());
            System.out.println(list.dequeue());
            System.out.println(list.dequeue());
            System.out.println(list.dequeue());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
