package Exception.StringEx;

public class StringEx {
    public static void main(String[] args) throws Exception {
        String str = "Manish";
        if(str.contains("s")) throw new Exception("Found s in String");
    }
}
