package Tutorial.Whashmap;
import java.util.WeakHashMap;
public class Whashmap {
    public static void main(String[] args) {
        WeakHashMap<String,Integer>even = new WeakHashMap<>();
        String t = new String("Two");
        Integer tValue = 2;
        String f = new String("Four");
        Integer fvalue = 4;
        even.put(t,tValue);
        even.put(f,fvalue);
        System.out.println("Weak Hashmap: " + even);
        t = null;
        //System.gc();
        System.out.println("Weakhash Map Garbage Collection : " + even);

    }
}
