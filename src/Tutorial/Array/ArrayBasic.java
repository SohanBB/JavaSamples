package Tutorial.Array;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        System.out.println("Enter element of array: ");
        int []array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+ (i+1) +" element: ");
            array[i]= input.nextInt();

        }
        input.close();
        System.out.println(Arrays.toString(array));

        for(int j=0;j<size;j++){
            System.out.println(array[j]);
        }
    }
}
