package Exercise.JavaString;

import java.util.Date;

public class JavaString {
    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date);
        String str3 = "Java language is easy";
        System.out.println(str3);
        String str4 = str3.replace("easy","Hard");
        System.out.println(str4);
        String str5 = "abcab";
        boolean flag=true;
        for (int i=0;i<str5.length()-1;i++){
            flag =true;
            for (int j = i+1; j < str5.length() ; j++) {
                if(i!=j && str5.charAt(i)==str5.charAt(j)){
                    System.out.print(str5.charAt(j));
                    flag = false;
                    break;
                }

            }

        }

        System.out.println("PALINDROME CHECK QUICK METHOD :");
        String palindromeString = "madam";
        System.out.println("madam");
        int n = palindromeString.length();
        int count= 0;
        for (int i = 0; i < n/2; i++) {
            if(palindromeString.charAt(i)==palindromeString.charAt(n-i-1))
                count++;
            System.out.println((count==n/2)?" is Palindrome":"Not a Palindrome ");

        }
      /*   String str1 = "Java and Python are language ";
        String str2 = "Python";

        if (str1.contains(str2)) {
            System.out.println("Contains the string: ");

        }
        else{
            System.out.println("does not contains the string: ");
        }
        String obj1 = new String("Object");
        String obj2 = new String("Object");
        boolean result = obj1==obj2;
        System.out.println(result);
        if(Objects.equals(obj1, obj2)){
            System.out.println("object contain is same: ");
        }
        else
            System.out.println("object contains are not same ");





       Scanner input = new Scanner(System.in);
        System.out.println("Enter a String 1 : ");
        String str1 = input.nextLine();
        System.out.println("Enter a String 2 : ");
        String str2 = input.nextLine();
        //System.out.println("Character at index: ");
        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);
        if(result>0){
            System.out.println("String 1 is GREATER than String 2: ");
        }
        else if (result==0){
            System.out.println("Strings are SAME : ");
        }
        if(result<0)
        {
            System.out.println("String 1 is LESS than String 2: ");
        }


        System.out.println("Palindrome check: ");
        String string = "this is java code";
        char [] cstr=string.toCharArray();
        int n= cstr.length;
        int i=0;
        int j=n-1;
        boolean isPalindrome =true;
        while (i==j  || j == i + 1){
            if(cstr[i]!=cstr[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

      */
    }
}
