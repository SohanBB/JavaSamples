package Exercise.JavaLinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String>list= new LinkedList<>(Arrays.asList("Amber","Blue","Cyan","Denim","Emerald"));
        for(int i=0 ;i< list.size();i++){
            System.out.println(list.get(i));
        }

        list.add(5,"Flax");
        list.addLast("Green");
        for (int j = list.size()-1; j>=0 ; j--) {
            System.out.println("Element " + list.get(j)+" at index "+j);

        }
        list.remove("Emerald");
        list.addLast("Green");
        System.out.println(list);
        Set<String>listSet= new HashSet<>(list);
        list.clear();
        list.addAll(listSet);
        System.out.println(listSet);

    }

}
