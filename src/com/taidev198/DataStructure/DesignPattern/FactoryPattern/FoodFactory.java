package com.taidev198.DataStructure.DesignPattern.FactoryPattern;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class FoodFactory {

    public static Food getFood(String animalName){

        switch (animalName){
            case "zebra": return new Hay(30);
            case "rabbit":return new Pellets(50);
            case "goat": return new Fish(60);
        }

        throw new UnsupportedOperationException("Unsupported animal: " + animalName);
    }
}
