package com.company.encapsule;

public class Info {
    String bookName;
    String author;
    Info ( String bookName,String author){
       this.bookName= bookName;
        this.author= author;
    }
    public void getInfo (){
        System.out.println("Book Name: "+ bookName + " Author: " + author );
      }

}