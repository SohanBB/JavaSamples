package GeeksQuestions.LargestInList;

import java.util.*;

public class LargestInList {
    public static void main(String[] args) {
        List<Integer> list;
        list = Arrays.asList(3,1,8,2,7,5,9);
        System.out.println(list);
        int max= 0;
       for(Integer element:list){
           if(element>max){
               max = element;
           }
        }
        System.out.println("Max Value in List is: "+max);
    }
}
