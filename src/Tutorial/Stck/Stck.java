package Tutorial.Stck;

import java.util.List;
import java.util.Stack;

public class Stck {
     List<String> pepole;
     public Stck (){
         this.pepole = new Stack<>();

     }
     public void push (String person){
         this.pepole.add(person);
     }
    public  String pop() throws Exception {
         if(this.pepole.size() > 0 ){
             return this.pepole.remove(this.pepole.size()-1);
         }
         throw new Exception("Can't Pop Empty stack ");
    }

    public static void main(String[] args) {
        Stck stck = new Stck();
        stck.push("Sam");
        stck.push("John");
        stck.push("Tina");
        stck.push("Kim");
        try {
            System.out.println(stck.pop());
            System.out.println(stck.pop());
            System.out.println(stck.pop());
            System.out.println(stck.pop());
            System.out.println(stck.pop());
        }
        catch (Exception e){
            System.out.println("Stack is Empty");
        }
    }

}
