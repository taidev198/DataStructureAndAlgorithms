package com.taidev198.DataStructure.Generics.GenericMethod;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class GenericMethod {




    public static void main(String...args){

        Pair<Integer, String> p1 = new Pair<>(10, "tai");
        Pair<Integer, String> p2 = new Pair<>(10, "tai");
        System.out.println(Util.compare(p1, p2));
    }
}
