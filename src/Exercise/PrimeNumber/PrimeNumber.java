package Exercise.PrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=20;
        boolean flag = false;
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0) {
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Number is Prime: ");
        }
        else
            System.out.println("Number is not prime: ");

    }

    }

