package Exercise.SmallestIntArray;

import java.util.Arrays;

public class SmallestIntArray {
    static int solution (int []array){
     int smallInt =1;
        if (array.length == 0)
            return smallInt;
        Arrays.sort(array);
        if(array[0]>1)
            return  smallInt;
        if(array[array.length-1]<=0)
            return smallInt;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==smallInt){
                smallInt++;
            }

        }
        return smallInt;

    }

    public static void main(String[] args) {
        int []array = {1,2,3,5,1,0};
        SmallestIntArray.solution(array);
    }
}
