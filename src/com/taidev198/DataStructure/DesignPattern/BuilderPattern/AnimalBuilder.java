package com.taidev198.DataStructure.DesignPattern.BuilderPattern;

import com.taidev198.DataStructure.DesignPattern.ImmutableObject.Animal;

import java.util.Arrays;
import java.util.List;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class AnimalBuilder {

    private int age;
    private String species;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species){
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods){
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build(){
        return new Animal(species, age, favoriteFoods);
    }

    public static void main(String...args){

        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder.setAge(10)
                .setSpecies("duck")
                .setFavoriteFoods(Arrays.asList("grass","fish"));
        Animal animal = duckBuilder.build();

        //way 2:

      Animal flamingo = new AnimalBuilder()
              .setAge(10)
              .setSpecies("flamingo")
              .setFavoriteFoods(Arrays.asList("algae","insects")).build();

    }
}
