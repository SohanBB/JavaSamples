package Tutorial.Prime;

public class Prime {
    public static void main(String[] args) {
        int n= 56;
        boolean flag= true;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                flag = false;
                break;
            } 
        }
        if(flag)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");

    }
}
