package com.company.interfacex;

class Rectangle implements Side {
    public void getArea(int side1, int side2){
        System.out.println("Area of Rectangle: " + (side1 * side2));
    }
}
