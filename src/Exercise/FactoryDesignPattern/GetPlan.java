package Exercise.FactoryDesignPattern;

import java.util.Scanner;

class GetPlan {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println(" For Domestic plan select 1 and for Commercial plan select 2 ");
         int ab =input.nextInt();
         System.out.println("Enter electricity units : ");
         double units = input.nextDouble();
         if(ab==1){
             System.out.println("Domestic Plan");
            DomesticPlan dp= new DomesticPlan();
             dp.getRate();
             dp.calculateBill(units);
         }
         if (ab==2){
             System.out.println("Commercial Plan");
             CommercialPlan cp = new CommercialPlan();
             cp.getRate();
             cp.calculateBill(units);
         }
         else System.out.println("Invalid choice");

     }
}
