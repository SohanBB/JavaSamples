package Tutorial.Gcd;

public class Gcd {
    public static void main(String[] args) {
        int num1 = 86;
        int num2 = 98;
        while (num1 != num2){
            if(num1>num2){
                num1=  num1 -num2;
            }
            else {
                num2 -=num1;
            }
        }
        System.out.println("GCD: "+num1);
    }
}