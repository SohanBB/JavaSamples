package Tutorial.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List <Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println("FOR LOOP");
        for (int num :numbers){
            System.out.println(num);}
        System.out.println("ITERATOR");
        Iterator<Integer>N =numbers.listIterator();
        System.out.println(N.next());
        //System.out.println("WHILE LOOP");
        //        while (N.hasNext()){
        //            System.out.println(N.next());
        }

    }


