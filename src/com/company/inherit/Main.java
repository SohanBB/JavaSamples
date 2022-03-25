package com.company.inherit;

public class Main {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}
abstract class MotorBike {
    abstract void brake();
}