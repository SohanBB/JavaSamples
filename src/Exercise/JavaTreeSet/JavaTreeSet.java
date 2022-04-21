package Exercise.JavaTreeSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<String>treeSet1 = new TreeSet<>(Arrays.asList("WHITE","PINK","RED","BLUE","ORANGE"));
        treeSet1.add("YELLOW");
        Iterator<String>itr = treeSet1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        TreeSet<String>treeSet2 = new TreeSet<>(Arrays.asList("CYAN","PINK","RED","GREEN"));
        TreeSet<String>treeSet3 = new TreeSet<>();
        treeSet3.addAll(treeSet1);
        treeSet3.addAll(treeSet2);
        System.out.println(treeSet3);
        Comparator<? super String> cmp = treeSet3.comparator();

    }
}
