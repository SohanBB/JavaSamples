package Exercise.JavaHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {
    public static void main(String[] args) {
        String[] list = {"Red", "Green", "Black", "White"};
        HashSet<String> hashSet1 = new HashSet<>(Arrays.asList(list));
        System.out.println(hashSet1);
        hashSet1.add("Yellow");
        Iterator<String> itr = hashSet1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        HashSet<String>hashSet2= new HashSet<>(Arrays.asList("Cyan","Yellow","Red","Pink","Violet"));
        boolean result = hashSet1.addAll(hashSet2);
        if(result){
            System.out.println(result);
        }
        System.out.println(hashSet1);

    }}