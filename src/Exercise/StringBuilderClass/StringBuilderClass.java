package Exercise.StringBuilderClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello World!");
        System.out.println(stringBuilder);
        stringBuilder.append("Hello !");
        System.out.println(stringBuilder);
        StringBuilder sb = new StringBuilder("This is String");
        System.out.println(sb);
    }
}
