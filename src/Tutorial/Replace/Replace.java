package Tutorial.Replace;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a string with special character: ");
        String str = input.nextLine();
        //String str = "J!#&0A*&V<>A()co%d#e";
       StringBuilder result = new StringBuilder();
       for(int i=0;i<=str.length()-1;i++){
//           if(str.charAt(i)>65 && str.charAt(i)<123){
//               result.append(str.charAt(i));
//           }
           if (str.charAt(i)<=91) {
               result.append(Character.toChars(str.charAt(i) + 32));
           }
        }
//       result.toString().to
        System.out.println(result.toString());

}}
