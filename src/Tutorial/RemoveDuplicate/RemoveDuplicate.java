package Tutorial.RemoveDuplicate;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4));
        System.out.println("Array list with duplicates: "+num);
        Set<Integer> numNod = new HashSet<>(num);
        num.clear();
        num.addAll(numNod);
        System.out.println("Array list without duplicates: "+num);
        }
    }
