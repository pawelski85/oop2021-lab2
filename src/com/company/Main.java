package com.company;

import com.company.animals.Animal;
import com.company.animals.Human;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        Human humanBuyer = new Human(5.0);
        humanBuyer.cash=5.0;


        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;
        me.cash=10.0;


        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Phone iPhone6 = new Phone("apple", "6s", 5.0, "iOs");

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Diesel();
        fiat.engineSize = 1.9;
        fiat.fuelType = "disel";
        fiat.producer = "Fiat";
        fiat.model = "Bravo";

        me.car=fiat;
        me.phone=iPhone6;

        System.out.println(iPhone6.os);
        System.out.println(iPhone6.screenSize);
        System.out.println(iPhone6.model);
        System.out.println(iPhone6.producer);

        fiat.turnOn();
        iPhone6.turnOn();

        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println(me.getClass());
        System.out.println(me.getClass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass().getSuperclass());


        fiat.sell(me,humanBuyer, 2.0);
        iPhone6.sell(me,humanBuyer,1.0);

        dog.feed();
        dog.feed(20.0);

    }
}
