package com.taidev198.DataStructure.DesignPattern.ImmutableObject;

import java.util.List;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class Animal {

    private  final List<String> favoriteFood;

    public Animal(List<String> favoriteFood){
        if (favoriteFood == null) throw  new RuntimeException("favoriteFood is required");
        this.favoriteFood = favoriteFood;
    }

    public List<String> getFavoriteFood(){ return favoriteFood;}//make class mutable
}
