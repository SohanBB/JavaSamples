package Exercise.SlidingWindow;

import java.util.*;

public class SlidingWindow {
    public static long Roof(List<Long>cars,int k){
        if(cars.size() ==0 ||k<0){
        }
        Collections.sort(cars);
        long minRoofDis = Long.MIN_VALUE;
        for(int i=0; i< cars.size()-k;i++){
            minRoofDis = Math.min(minRoofDis,cars.get(i+k-1)-cars.get(i));
        }
        return minRoofDis;
    }

    public static void main(String[] args) {

    }


}
