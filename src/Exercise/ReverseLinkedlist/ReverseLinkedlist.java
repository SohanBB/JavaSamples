package Exercise.ReverseLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        LinkedList<Integer>rList = new LinkedList<>();
        Iterator<Integer>itr = list.descendingIterator();
        itr.forEachRemaining(rList::add);
        System.out.println(rList);
    }

}
