package DSA.Sort;

import java.util.Arrays;

class Sort {
    public static void main(String[] args) {
        int []data = {3,1,5,2,4};
        Sort.sorting(data);
        System.out.println(Arrays.toString(data));


    }
    static void sorting(int []data){
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]= temp;
                }

            }

        }
    }

}