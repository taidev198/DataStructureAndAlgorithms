package com.taidev198.DataStructure.Generics.TypeErasure;

/**
 * @author traig on 7/13/2018.
 * @project DataStructure
 */
public class ErasureOfGenericMethod {

    /**The java compiler replaces unbounded with Object*/


    class Shape{}
    class Circle extends Shape{}
    class Rectangle extends Shape{}

    //public static <T extends Shape> void draw(T shape){}
    //the java compile replaces it with Shape:
    //public void draw(Shape shape);
}
