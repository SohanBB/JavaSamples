package Exercise.TestException;

public class TestException {
    public static void main(String[] args) throws Exception {
        String str = "manish";
        if(str.contains("s")){
            throw new Exception("Found s in manish");
        }
    }
}
