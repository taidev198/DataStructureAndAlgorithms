package com.taidev198.DataStructure.Generics.ComparatorVSComparable;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 * @author traig on 7/15/2018.
 * @project DataStructure
 */
public class UsingComparator {

    static class Duck implements Comparable<Duck> {
        private String name;

        public Duck(String name){ this.name = name; }
        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Duck o) {
            return name.compareTo(o.name);
        }
    }


    public static void main(String...args){

        List<Duck> list = new ArrayList<>();
        list.add(new Duck("Quack"));
        list.add(new Duck("Puddles"));

        Collections.sort(list);

    }
}
