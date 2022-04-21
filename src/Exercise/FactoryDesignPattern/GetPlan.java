package Exercise.FactoryDesignPattern;

import java.util.Scanner;

class GetPlan {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println(" For Home plan select 1 and for International plan select 2 ");
         int ab =input.nextInt();
         System.out.println("Enter electricity units : ");
         int units = input.nextInt();
         if(ab==1){
             System.out.println("Home Plan");
             HomePlan hp= new HomePlan();
             hp.getRate();
             hp.calculateBill(units);
         }
         if (ab==2){
             System.out.println("International Plan");
             InternationalPlan ip = new InternationalPlan();
             ip.getRate();
             ip.calculateBill(units);
         }
         else System.out.println("Invalid choice");

     }
}
