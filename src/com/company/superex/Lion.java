package com.company.superex;

class Lion extends Animal {
    public void display (){
        System.out.println("Lion is the king of Animals");
    }
    public void msg(){
        super.display();
    }
}
