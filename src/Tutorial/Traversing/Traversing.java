package Tutorial.Traversing;

import java.util.ArrayList;
import java.util.List;

public class Traversing {
    public static void main(String[] args) {
     int [] arr=  {10,20,30,40,50};
     for (int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
     }
     System.out.println("Advance for loop: ");
     for(int num : arr){
         System.out.println(num+" ");
     }
        List<Integer> list = new ArrayList<>();
     list.add(12);
     list.add(13);
     list.add(14);
     list.add(15);
     System.out.println("List is: "+list);
     for(int ele : list ){
         System.out.println("List element: "+ele);
     }
     System.out.println("Using while loop: ");
     int i=0;
     while(i < list.size()){
         System.out.println(list.get(i));
         i++;
        }
    }
}
