package Exception.Custom;

public class StringException {
    public static void main(String[] args) throws ExceptionSohan {
        String str = "Sohan";
        if(str.contains("Sohan")){
            throw new ExceptionSohan("String contains sohan");
        }
    }
   static class ExceptionSohan extends Exception {
       public ExceptionSohan(String message) {
           super(message);
       }
   }
}
