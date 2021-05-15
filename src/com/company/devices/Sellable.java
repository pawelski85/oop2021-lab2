package com.company.devices;

import com.company.Human;

public interface Sellable {
    boolean sell(Human seller, Human buyer, Double price);
}
