package org.example;
public class Main {
    public static void main(String[] args) {
        Vehicle one = new Vehicle(4, 10);
        one.setNumberOfWheels(5);
        one.setColor("green");
        System.out.println(one.numberOfWheels);
        System.out.println(one.getColor());
        System.out.println(one.getFuelType());
    }
}