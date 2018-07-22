package com.taidev198.DataStructure.Generics.ComparatorVSComparable;

import java.util.Comparator;

/**
 * @author traig on 7/15/2018.
 * @project DataStructure
 */
public class UsingComparator {

    class Duck implements Comparator<Duck>{

        private String name;
        private int weight;

        public Duck(String name, int weight){

            this.name = name;
            this.weight = weight;
        }


        @Override
        public int compare(Duck o1, Duck o2) {
            return 0;
        }


    }

    public static void main(String...args){

    Comparator<Duck> d1 = (d11, d2) -> d11.weight - d11.weight;

    }
}
