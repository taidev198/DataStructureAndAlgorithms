package com.taidev198.DataStructure.DesignPattern.ImmutableObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class Animal {

    /**All fields are marked private and final,
     * the constructor sets them upon object creation.
     * There are no setter methods and the class its self marked final,
     * so the methods cannot be overridden by a subclass.*/
    private  final List<String> favoriteFood;
    private final String species;
    private final int age;
    public Animal(String species, int age, List<String> favoriteFood){
        this.age = age;
        this.species =species;

        //any mutable input arguments are copied to the instance instead of being
        //used in directly.
        if (favoriteFood == null) throw  new RuntimeException("favoriteFood is required");
        this.favoriteFood = new ArrayList<>(favoriteFood);
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String getFavoriteFood(int index) {
        return favoriteFood.get(index);
    }

    public int getFavoriteFoodCount() {
        return favoriteFood.size();
    }
}
