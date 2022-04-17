package Exercise.QuickPal;

public class QuickPal {
    public static void main(String[] args) {
        String str = "radar";
        int num = 12321;
        int onum = num;
        int remainder=0;
        int rnum =0;
        int n = str.length();
        int count =0;
        int i;
        for (i = 0; i <n/2 ; i++) {
            if(str.charAt(i)==str.charAt(n-i-1)){
                count++;
            }

        }
        System.out.println((count==n/2)? "is Palindrome":"Not Palindrome");

    while(num>0){
         remainder = num%10;
         rnum = rnum * 10 + remainder;
         num = num/10;
    }
    if(rnum==onum)
        System.out.println("Number is Palindrome: ");
    else System.out.println("Number is not palindrome:");
    }

}
