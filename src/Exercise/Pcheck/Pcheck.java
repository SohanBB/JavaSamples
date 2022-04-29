package Exercise.Pcheck;

public class Pcheck {
    public static void main(String[] args) {
        String str = "radar";
        String rstr = "";
        int n = str.length();
        for (int i = n-1; i>= 0 ; i--) {
            rstr= rstr+str.charAt(i);
        }
        if(rstr.equals(str)){
            System.out.println("Given string is Palindrome: ");
        }
        else
            System.out.println("Given string is not Palindrome: ");
}}
