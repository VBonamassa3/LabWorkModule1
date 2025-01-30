package org.example;

public class Vehicle {
    int numberOfWheels;
    String color, fuelType;
    float engineSize;

    public Vehicle() {
        this.numberOfWheels = numberOfWheels;
        this.color = " ";
        this.fuelType = " ";
        this.engineSize = engineSize;
    }

    //all setters and getters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public float getEngineSize() {
        return this.engineSize;
    }

}