package com.company.devices;

import com.company.animals.Human;

public class Phone extends Device {
    public final Double screenSize;
    public String os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, String os) {
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this) {
            if (buyer.cash >= price) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.phone = this;
                seller.phone = null;
                System.out.println("phone has been sold");
                return true;
            }

        }
        return false;
    }
}
