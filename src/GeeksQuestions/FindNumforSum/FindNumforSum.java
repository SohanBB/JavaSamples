package GeeksQuestions.FindNumforSum;

import java.util.Scanner;

public class FindNumforSum {
    static void find(int []array,int sum){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(sum== array[i]+array[j]){
                    System.out.println("Elements are: "+"{"+array[i]+"["+i+"],"+array[j]+"["+j+"]}");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int [] array =new int[n];
        for (int i = 0; i<n ; i++) {
            System.out.print("Enter element : ");
            array[i] = input.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum = input.nextInt();
        find(array,sum);
    }
}
