package com.company.trycatch;

public class Catchtry {
    public static void main(String[] args) {
       Ex ex = new Ex();
       ex.info();


    }
}
class Ex {
    public void info(){
        try {
            int[] a = new int[7];
            a[9]=8;
            //a[8]= 10/0 ;
        }
        catch (ArithmeticException e1){
            System.out.println("ArithmeticException => " + e1.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ArrayIndexOutOfBoundsException =>"+ e2.getMessage());
        }
        throw new ArithmeticException("CANOT DIVIDE BY ZERO ANS IS INFINITY");
    }

}
