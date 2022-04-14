package DSA.Sort;

import java.util.Arrays;

public class Sort {
        static void sorting (int array[]){
            int size =array.length;
            for (int i = 0; i <size ; i++) {
                for(int j=0;j<size-i-1;j++){
                    if (array[j] > array[j+1]) {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int[]array={3,1,4,5,2};
        System.out.println("Unsorted array: "+ Arrays.toString(array));
        Sort.sorting(array);
        System.out.println("Sorted array: "+Arrays.toString(array));
    }
    }


