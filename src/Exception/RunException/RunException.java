package Exception.RunException;

public class RunException {
    public static void main(String[] args) throws UncheckedException {
        String str = "Unchecked Exception";
        if(str.contains("Exception")) throw new UncheckedException("String contains Exception : ");
    }
    static class UncheckedException extends RuntimeException{
        public UncheckedException(String message) {
            super(message);
        }
    }
}
