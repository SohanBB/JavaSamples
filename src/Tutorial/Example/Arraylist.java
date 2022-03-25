package Tutorial.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Arraylist {
    public static void main(String[] args) {
        Stack<String> list= new Stack<>();
        list.push("John");
        list.push("Kim");
        list.push("Peter");
        Iterator <String>itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        String E = list.pop();
        System.out.println("First to exit "+E);
    }
}
