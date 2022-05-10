package Exercise.RemoveSpChar;

import java.util.Scanner;

public class RemoveSpChar {
    public static void remover(String str) {
        for (int i = 0; i <= str.length()-1 ; i++) {
            if(str.charAt(i)>64 && str.charAt(i)<123 ){
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string with special Character: ");
        String str = input.nextLine();
        RemoveSpChar.remover(str);
    }
}