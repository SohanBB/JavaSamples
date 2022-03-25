package com.company.exception;

public class Exception {
    public static void main(String[] args) {
      try {
          int infinity = 10/0;
          System.out.println(infinity);
      }
      catch (ArithmeticException a) {
          System.out.println("Arithmetic Exception :" + a.getMessage() );

       }
      finally {
          System.out.println("This will run anyway:");
      }
    }
}

