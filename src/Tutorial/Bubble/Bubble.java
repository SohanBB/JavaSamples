package Tutorial.Bubble;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int []arr = {9,4,7,2,5,6,8,3};
       Sort.bubblesSort(arr);
        System.out.println("Sorted in Ascending order: ");
        System.out.println(Arrays.toString(arr));
    }

}
class Sort {
    static void bubblesSort(int []arr){
        int size = arr.length;
        int i,j;
        for( i=0;i<size-1;i++)
         for( j=0;j<size-i-1;j++)
         if (arr[j]>arr[j+1]) {
             int temp = arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;

        }
    }

}
