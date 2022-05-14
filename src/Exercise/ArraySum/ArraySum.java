package Exercise.ArraySum;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    static void sumOfArrayElement(int []array){
        int result = 0;
        for (int i = 0; i < array.length ; i++) {
            result+= array[i];
        }
        System.out.println("Sum of array element: "+result);
    }
    static void largestElement(int []array){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max){
                max =array[i];
            }
        }
        System.out.println("Largest number : "+max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int [] array =new int[n];
        for (int i = 0; i<n ; i++) {
            System.out.print("Enter element : ");
           array[i] = input.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(array));
        sumOfArrayElement(array);
        largestElement(array);

    }
}
