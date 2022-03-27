package Tutorial.PalindromCh;

public class PalindromCh {
    public static void main(String[] args) {
        String str = "radar";
        String rstr = "";
        for(int i =str.length()-1;i>=0;i--){
            rstr = rstr+str.charAt(i);

        }
        if(str.equals(rstr) ){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

        int num = 3223;
        int rnum =0;
        int reminder;
        int onum = num;
        while(num !=0){
            reminder= num%10;
            rnum = rnum*10+reminder;
            num= num/10;
        }
        if(onum == rnum){
            System.out.println("number is palindrome");
        }
        else
            System.out.println("Not palindrome ");

        String reverse = "reverse";
        String temp = "";
        System.out.println(reverse);
        for(int i =reverse.length()-1;i>=0;i--){
            temp = temp+reverse.charAt(i);
        }
        System.out.println(temp);
    }

}
