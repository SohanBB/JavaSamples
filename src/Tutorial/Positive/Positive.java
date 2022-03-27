package Tutorial.Positive;

import java.util.Arrays;
import java.util.Iterator;

public class Positive {
    public static void main(String[] args) {
        int [] array = {2,-3,4,-7,-9};
        int j =0;
        while(j< array.length) {
            if(array[j]>=0){
                System.out.format("%d," , array[j]);
            }
            j++;
        }

    }}
