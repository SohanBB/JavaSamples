package Exercise.Pcheck;

public class Pcheck {
    public static void main(String[] args) {
        String str = "radar";
        int n = str.length();
        String rstr = "";
        for (int i = n-1; i >=0 ; i--) {
            rstr = rstr+str.charAt(i);
        }
        System.out.println(rstr);
        if(str.equals(rstr))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
}
