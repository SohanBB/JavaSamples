package Exercise.FactoryDesignPattern;
 abstract class Plan {
     protected double rate;
     abstract void getRate();

     public void calculateBill(int units){
         System.out.println("Billing amount in INR ->"+units*rate);
     }
}
