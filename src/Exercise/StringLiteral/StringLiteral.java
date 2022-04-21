package Exercise.StringLiteral;

public class StringLiteral {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());
        String b = "Hello";
        System.out.println(b.hashCode());
        String obj1 = new String("scaler");
        System.out.println(obj1.hashCode());
        String obj2 = new String("scaler");
        System.out.println(obj2.hashCode());


    }
}
