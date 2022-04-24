package Exercise.DoubleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DoubleArray {
    static int finalVal(ArrayList<Integer> arr, int k) {
        Set<Integer> arrSet = new TreeSet<>();
        arrSet.addAll(arr);
        while (arrSet.contains(k)) {
            k *= 2;
        }
        return k;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(2,3,4,6,8));
        int result = finalVal(arr,2);
        System.out.println(result);
    }
}
