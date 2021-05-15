package com.company.devices;

public abstract class Device implements Sellable {
    public String producer;
    public String model;
    private Integer yearOfProduction;

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

}
