package Tutorial.List2Stack;

import java.util.ArrayList;
import java.util.List;

public class List2Stack {
    List<String>People;
    public List2Stack(){

        this.People= new ArrayList<>();
    }
    public void push (String person){
        this.People.add(person);
    }
    public String pop () throws Exception{
        if(this.People.size()>0){
            return this.People.remove(this.People.size()-1);
        }
        throw new Exception("Can't pop from empty Stack");
    }

    public static void main(String[] args) {
        List2Stack list = new List2Stack();
        list.push("Tina");
        list.push("Meena");
        list.push("Ram");
        try {
            System.out.println(list.pop());
            System.out.println(list.pop());
            System.out.println(list.pop());
            System.out.println(list.pop());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

