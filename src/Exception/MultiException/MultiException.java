package Exception.MultiException;

import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();
        if (str.contains("s")) {
        }
        try {
            throw new Exception("String contains s");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }
