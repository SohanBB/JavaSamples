package com.company.Linkedlist;
import java.util.List;
import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Linked List: " + numbers);
        int num = numbers.get(1);
        System.out.println("Accessed Element: " + num);
        int rnum = numbers.remove(3);
        System.out.println("Removed Element: " + rnum);

    }
}
