package com.company.animals;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }



    @Override
    public Double eat(Double weight) {

        if (weight > 0) {
            Double oldWeight=weight;
            weight =0.0;
            return oldWeight;
        } else {
            System.out.println("animal cannot be eaten");
            return weight;
        }

    }
}
