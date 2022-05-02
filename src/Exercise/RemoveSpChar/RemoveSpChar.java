package Exercise.RemoveSpChar;

import java.util.Scanner;

public class RemoveSpChar {
    public static void remover(String str) {
        int n = str.length();
        char[] strA = str.toCharArray();
        for (int i = 0; i < n - 1; i++) {
            if (strA[i] > 64 && strA[i] < 123) {
                System.out.print(strA[i]);

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