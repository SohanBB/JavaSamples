package Exception.Custom;

public class CustomException {

    public static void main(String[] args) throws NegativeArgumentException {
        try {
            int result = sum(2, -3);
        } catch (NegativeArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    static int sum(int a, int b) throws NegativeArgumentException {
        if ( a< 0 || b < 0) {
            throw new NegativeArgumentException();
        }
        return a +b;
    }

    static class NegativeArgumentException extends Exception {

    }
}


