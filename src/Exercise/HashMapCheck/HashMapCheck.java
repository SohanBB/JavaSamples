package Exercise.HashMapCheck;

import java.util.HashMap;
import java.util.Map;

public class HashMapCheck {
    public static void main(String[] args) {
        HashMap<String,State> stateCapitalMap = new HashMap<>();
        State s1 = new State();
        s1.state="Maharashtra";
        s1.capital="Mumbai";
        stateCapitalMap.put(String.valueOf(s1.hashCode()), s1);
        for (Map.Entry<String, State> stringStateEntry : stateCapitalMap.entrySet()) {
            System.out.println(stringStateEntry.getKey());
            System.out.println(stringStateEntry.getValue());
        }
    }
}
