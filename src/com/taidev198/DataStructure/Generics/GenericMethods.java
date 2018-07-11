package com.taidev198.DataStructure.Generics;

/**
 * @author traig on 7/10/2018.
 * @project DataStructure
 */
public class GenericMethods<T> {

    private T t;
    private T type;
    /**Return type T
     * We declare the formal type parameter of <T>
     * Unless a method is obtaining the generic formal type parameter from the class/interface,
     * it is specifed immediately before the return type of the method
     * */
    public static <T> T ship(T t){
       return t;
    }

//    DOES NOT COMPILE
//    static T noGood(T t){
//        return t;
//    }

    public static void main(String...args){


        //there are two way to invoke generic method
        //the firstly : normally
        //the secondly:GenericMethods.<Integer>ship(1);
    }
}
