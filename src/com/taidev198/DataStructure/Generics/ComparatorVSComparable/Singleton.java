package com.taidev198.DataStructure.Generics.ComparatorVSComparable;

/**
 * @author traig on 7/15/2018.
 * @project DataStructure
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
