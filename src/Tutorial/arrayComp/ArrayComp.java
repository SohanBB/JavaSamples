package Tutorial.arrayComp;

import java.util.Arrays;

public class ArrayComp {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 5};
        int[] arr2 = new int[] {1, 2, 3, 5};
        int[] arr3 = new int[] {1, 2, 5, 3};

        System.out.println("Are arr1 and arr2 equal?" + Arrays.equals(arr1, arr2));
        System.out.println("Are arr1 and arr3 equal?" + Arrays.equals(arr1, arr3));
        int []result = new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(result));
    }
}
