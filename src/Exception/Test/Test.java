package Exception.Test;

public class Test {
    public static void main(String[] args) throws Exception {
        String str = "Hello";
        for(int i =0; i<str.length();i++){
            if('o' == str.charAt(i)){
                throw new Exception("Found o ");
            }
        }
    }
}
