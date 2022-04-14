package Tutorial.RemoveDuplicate;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Array with duplicate element: "+numbers);
        Set<Integer>withoutDuplicate=new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(withoutDuplicate);
        System.out.println("Array without Duplicate: "+ withoutDuplicate);

        String str= "hello world";
        char[] cArray=str.toCharArray();
        System.out.println("Given string is: "+str);
        System.out.print("Duplicate characters in above string: ");
        for (int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(cArray[i]==cArray[j] ){
                    System.out.print(cArray[j]+", ");
                    break;
                }
            }
        }





      /*  ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4));
        System.out.println("Array list with duplicates: "+num);
        Set<Integer> numDuplicate = new HashSet<>(num);
        num.clear();
        num.addAll(numDuplicate);
        System.out.println(numDuplicate);*/
        }
    }
