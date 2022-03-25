package Tutorial.Tree;
import java.util.TreeMap;
public class Tree {
    public static void main(String[] args) {
        TreeMap<String,Integer>Dashak = new TreeMap<>();
        Dashak.put("Ten", 10);
        Dashak.put("Twenty", 20);
        Dashak.put("Thirty", 30);
        System.out.println(Dashak);
        TreeMap<String ,Integer> uDashak = new TreeMap<>();
        uDashak.put("Fourty", 40);
        Dashak.putAll(uDashak);
        System.out.println("Updated Tree Map: " + Dashak);
        System.out.println("Keys: " + Dashak.keySet());
        System.out.println("Values: " + Dashak.values());
        uDashak.replace("Fourty",40,50);
        System.out.println(uDashak);
        String firstkey = Dashak.firstKey();
        System.out.println("First key: " + firstkey);
        System.out.println("Last Entry: " + Dashak.lastEntry());

    }
}
