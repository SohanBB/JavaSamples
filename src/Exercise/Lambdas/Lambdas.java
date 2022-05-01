package Exercise.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<>(Arrays.asList("John","Tim","Peter","Sara","Jane"));
        System.out.println(name);
        for(int i=0;i< name.size();i++){
            System.out.println(name.get(i));
        }

        System.out.println("* Using Lambada Expression *");
        name.forEach((n) ->{
            System.out.println(n);
        });

    }
}
