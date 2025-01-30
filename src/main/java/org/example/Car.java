package org.example;

public class Car extends Vehicle{ //taking all attributes from vehicle
    String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }

    public void displayInfo(){
        System.out.println("Here is everything about this car");
        System.out.println("Number of wheels: "+numberOfWheels);
        System.out.println("Color: "+color);
        System.out.println("Type of fuel used: "+fuelType);
        System.out.println("Engine size: "+engineSize);
        System.out.println("Brand of car: "+brand);
    }
}
