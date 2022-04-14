package DSA.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void sorting(int array[]){
        int size=array.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of Array: ");
        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        BubbleSort.sorting(array);
        System.out.println("Sorted array : "+Arrays.toString(array));


    }
}
