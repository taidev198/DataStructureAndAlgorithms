package com.taidev198.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/10/2018.
 * @project DataStructure
 */
public class Bounds {

/**A bounded parameter type is aa generic type that specifies
 * a bound for generic type.
 *
 * A wildcard generic type is an unknown generic type represented with
 * a question mark (?). We can use generic wildcard in three way
 * */
    static class Bird{}
    static class Sparrow extends Bird{}

    interface Flyer { void fly(); }
    class HangGlider implements Flyer { public void fly() {} }
    class Goose implements Flyer { public void fly() {} }


    /**Unbounded Wildcards
     * */
    public static void printList(List<?> list){
        for(Object x : list) System.out.println(x);
    }

    /**Upper-Bounded Wildcards
     * The upper-Bounded Wildcards says that any class extend class in dinamo or itself
     * can be used as the formal parameter type
     * */
    public static void useUpper_Bounded(){

        List<? extends Bird> list= new ArrayList<>();
        //the following code do not compile
//        list.add(new Bird());
//        list.add(new Sparrow());

        //The problem stems from the fact that Java  doesn't know
        //what type List<? extends Bird> really is. It could be List<Bird> or
        //List<sparrow> or some other generic type that hasn't even been written yet.

    }

    private void anyFlyer(List<Flyer> flyer) {
        groupOfFlyers(new ArrayList<Goose>());

    }
    private void groupOfFlyers(List<? extends Flyer> flyer) {

        //anyFlyer(new ArrayList<Goose>());
    }

    public static void useGenericWildcard(){
        //Unbounded wildcard
        List<?> list = new ArrayList<String>();

        //Wildcard with an upper bound, syntax:  ? extends type

        List<? extends Number> list1 = new ArrayList<Integer>();

        //Wildcard  with a lower bound , syntax :? super type

        List<? super Integer> list2 = new ArrayList<Number>();

        //List<String> cannot be assigned to List<Object>

        //We've established that a generic type cannot just use a subclass

        //List<Number> numbers = new ArrayList<Integer>();//does not compile
        //instead, we use upper bounded wildcards
        List<? extends Number> numbers = new ArrayList<Integer>();//compile


    }

    /**Lower-Bounded Wildcards
     * */

    public static void useLower_Bounded(){
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound4(objects);
        addSound4(strings);

    }

    public static void addSound1(List<?> list){

        //list.add("quack");
        //doesn't compile because unbounded generics are immutable
        //can pass a List<String> or List<Object>
    }

    public static void addSound2(List<? extends Object> list){

       // list.add("quack");
        //doesn't compile because unbounded generics are immutable
        //can pass a List<String> or List<Object>
    }

    public static void addSound3(List<Object> list){

        list.add("quack");
        //cannot pass List<String> because with generics, must pass exact match
    }

    public static void addSound4(List<? super String> list){

        list.add("quack");
        //can pass a List<String> or List<Object>
    }

    public static void main(String...args){
        useGenericWildcard();

    }
}
