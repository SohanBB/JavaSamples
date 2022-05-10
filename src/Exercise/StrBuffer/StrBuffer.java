package Exercise.StrBuffer;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bob");
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
