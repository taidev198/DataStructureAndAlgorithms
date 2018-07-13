package com.taidev198.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/10/2018.
 * @project DataStructure
 */
public class Generics {

    class A{}
    class B extends A{}
    class C extends B{}
     interface D{}
     interface E {}

    public static void main(String...args){

        List<?> list = new ArrayList<A>();
        method1(list);
        List<? extends A> list1 = new ArrayList<B>();
        method1(list1);
        List<? super B> list2 = new ArrayList<A>();
        method1(list2);
        List<? super A> list3 = new ArrayList<>();
    }

    /**The method1 uses a specific type parameter, T
     * It takes a parameter of List<T> or some subclass of T,
     * and return a single object of that type
     * */

    static <T> T method1(List<? extends T> list){
        return list.get(0);
    }

    /**The following method is wrong
     * */
//    static <T> <? extends T> method2(List<? extends T> list) { // DOES NOT COMPILE
//        return list.get(0);
//    }

    void method3(List<? super B> list){

    }

    /**The following method is wrong because
     * method4 tries to mix a method- specific type parameter
     * with a wildcard. A wildcard must have ? in it.
     * */
//    <X> void method4(List<X super B> list) { // DOES NOT COMPILE
//    }
}
