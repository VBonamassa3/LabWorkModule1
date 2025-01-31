package org.example;
public class Main {
    public static void main(String[] args) {
        Vehicle one = new Vehicle(); //new vehicle object
        one.setNumberOfWheels(8);
        one.setColor("white");
        one.setFuelType("diesel");
        one.setEngineSize(6);
        System.out.println(one.getNumberOfWheels()); //all 4 prints will test setters and getters
        System.out.println(one.getColor());
        System.out.println(one.getFuelType());
        System.out.println(one.getEngineSize());
        System.out.println();
        Car two = new Car(); //new car object
        two.setBrand("Honda");
        System.out.println(two.getBrand()); //testing getBrand method
        System.out.println();
        two.setColor("blue");
        two.setEngineSize(3);
        two.setNumberOfWheels(4);
        two.setFuelType("regular");
        two.displayInfo();
        System.out.println();
        two.honk();
    }
}