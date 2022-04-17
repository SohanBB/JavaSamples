package Exercise.ListExample;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of List: ");
        int size = input.nextInt();
        int j = 0;
        ArrayList<Integer>list = new ArrayList<Integer>();
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter element at index "+i);
            j=input.nextInt();
            list.add(j);
        }
        System.out.println(list.getClass().getSimpleName());
        System.out.println(list);
       for (int k= 0; k <size ; k++) {
            System.out.println("Element: "+list.get(k)+"  at index: "+k);
            
        }
       /* list.remove(0);
        System.out.println(list);
        System.out.println("Enter element tobe found: ");
        int x= input.nextInt();
        for (int i = 0; i <size ; i++) {
            if (list.get(i)==x){
                System.out.println("Element found at index : "+i);
            }

        }

        */
        System.out.println(list);
        Set<Integer> listSet = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(listSet);
        System.out.println(listSet);
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(","));
        System.out.println(listString);

        }

    }



