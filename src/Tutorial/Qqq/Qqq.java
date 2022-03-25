package Tutorial.Qqq;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Qqq {
    List <String> student;
   public Qqq (){
        this.student= new Stack<>();
    }
    public void push (String person){this.student.add(person);}

    public String pop() throws Exception {
        if (this.student.size() > 0) {
            return this.student.remove(this.student.size()-1);
        }
        throw new Exception("Can't POP from empty STACK");
    }

    public static void main(String[] args) {
        Qqq qqq = new Qqq();
        qqq.push("john");
        qqq.push("peter");
        qqq.push("sara");
        try {
            System.out.println(qqq.pop());
            System.out.println(qqq.pop());
            System.out.println(qqq.pop());
            System.out.println(qqq.pop());
        }
        catch (Exception e) {
            System.out.println("Empty STACK");

        }

    }


    }


