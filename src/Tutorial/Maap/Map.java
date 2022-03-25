package Tutorial.Maap;
import java.util.Map;
import java.util.HashMap;

class Maap {
    public static void main (String [] args){
        Map<String,Integer>num = new HashMap<>();
        num.put("One",1);
        num.put("Two",2);
        num.put("Three",3);
        System.out.println("MAP: " + num);
        System.out.println("KEYS : " + num.keySet());
        System.out.println("Values: " + num.values());
        int value = num.remove("Three");
        System.out.println("Removed KEY: " + value);
    }
}
