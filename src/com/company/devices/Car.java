package com.company.devices;

public class Car extends Device {

    public Double engineSize;
    public String fuelType;

    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }
}
