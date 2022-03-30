package Tutorial.ArrayLis;

import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayLis {
    public static void main(String[] args) {
        LinkedList<String>names = new LinkedList<>();
        names.add("John");
        names.add("Tim");
        names.add("Kim");
        names.add("Sarah");
        names.add(4,"Peter");
        System.out.println("LinkedList: "+names);
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Peter");
        students.add("Kim");
        students.add("Sam");
        students.add(2,"Tim");
        System.out.println("ArrayList: "+students);

    }
}
