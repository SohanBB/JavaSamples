package GeeksQuestions.MaxInArray;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    static void maxValue(int []array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("MaxValue is : "+max);
    }
    static void minValue(int []array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("MinValue is : "+min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = input.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at : "+i);
            array[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(array));
    maxValue(array);
    minValue(array);
    }
}
