package Tutorial.Replace;

import java.sql.Array;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a string with special character: ");
        String str = input.nextLine();
        //String str = "J!#&0A*&V<>A()co%d#e";
        String result = "";
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)>64 && str.charAt(i)<=122 ){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);}

}
