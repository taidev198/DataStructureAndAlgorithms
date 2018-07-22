package com.taidev198.DataStructure.Generics.ComparatorVSComparable;

import java.util.Comparator;

/**
 * @author traig on 7/15/2018.
 * @project DataStructure
 */
public class ComparingMultipleFields implements Comparator<ComparingMultipleFields.Squirrel> {



    class Squirrel{

        private int weight;
        private String species;

        public Squirrel(String species){
            if (species == null) throw new IllegalArgumentException();
            this.species = species;
        }

        public String getSpecies() {
            return species;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    @Override
    public int compare(Squirrel s1, Squirrel s2) {
       Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
       c  = c.thenComparingInt(s -> s.getWeight());
       return c.compare(s1, s2);
    }

    public static void main(String...args){


    }
}
