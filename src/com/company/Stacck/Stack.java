package com.company.Stacck;
import java.util.Stack;

 class Stacck {
    public static void main(String[] args) {
        Stack <String> Chairs = new Stack<>();
        Chairs.push("chair1");
        Chairs.push("chair2");
        Chairs.push("chair3");
        Chairs.push("chair4");
        System.out.println("Stack of Chairs: " + Chairs);
        String remove = Chairs.pop();
        System.out.println("Removed element: "+remove);
        String element = Chairs.peek();
        System.out.println("Top element: "+element);
        boolean result = Chairs.empty();
        System.out.println("Is stack empty: "+ result);
    }
}
