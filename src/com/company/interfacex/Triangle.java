package com.company.interfacex;

class Triangle implements Side {
    public void getArea(int side1, int side2){
        System.out.println("Area of Triagle: "+((side1*side2)/2));
    }
}
