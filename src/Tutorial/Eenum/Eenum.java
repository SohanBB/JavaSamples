package Tutorial.Eenum;
import java.util.EnumMap;
public class Eenum {
    enum Size {
        S, M, L, XL, XXL
    }

    public static void main(String[] args) {
        EnumMap<Size, Integer> Fitting = new EnumMap<>(Size.class);
        Fitting.put(Size.S,28);
        Fitting.put(Size.M,32);
        Fitting.put(Size.L,34);
        System.out.println("EnumMap: " + Fitting);
        System.out.println("Key/Value mappings: " + Fitting.entrySet());
        System.out.println("Keys: " + Fitting.keySet());
        System.out.println("Values: " + Fitting.values());
        int value = Fitting.get(Size.M);
        System.out.println("Value of M: " + value);

    }
}
