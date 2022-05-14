package DSA.Sort;

import java.util.Arrays;

class Sort {
    static void sorting(int data[]){
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length-i-1 ; j++) {
                if(data[j+1]<data[j]){
                    int temp = data[j];
                    data[j]= data[j+1];
                    data[j+1]= temp;
                }}}
    }

    public static void main(String[] args) {
        int[]data = {1,3,2,5,4,9,6};
        Sort.sorting(data);
        System.out.println(Arrays.toString(data));
    }
}