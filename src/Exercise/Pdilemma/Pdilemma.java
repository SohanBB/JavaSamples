package Exercise.Pdilemma;

import java.util.*;

public class Pdilemma {
    public static long carParkingRoof(List<Long> cars, int k) {
        // Write your code here
        if (cars.size() == 0 || k < 0) {
            return 0;
        }
        cars.sort(Comparator.naturalOrder());
        long minRoofLength = Long.MAX_VALUE;
        for(int i =0; i<= cars.size() - k ; i++) {
            long roofLength = cars.get(i + k - 1) - cars.get(i);
            minRoofLength = Math.min(minRoofLength, roofLength + 1);
        }
        return minRoofLength;
    }

    public static void main(String[] args) {
        List<Long>cars = new ArrayList<>(Arrays.asList(4L,2L,10L,8L,17L));

    }
}
