package Exercise.PrimeFun;

import java.util.Scanner;

public class PrimeFun {
     static void findPrime(int num){
        boolean flag = false;
        for (int i = 2; i<=num/2 ; i++) {
            if(num%i==0){
                flag = true;
                break;
            }
        }
         if(!flag){
             System.out.println(num);
         }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range ");
        System.out.print("min: ");
        int min = input.nextInt();
        System.out.print("max: ");
        int max = input.nextInt();
        for (int j= min; j <=max ; j++) {
            PrimeFun.findPrime(j);
        }
     }
}



