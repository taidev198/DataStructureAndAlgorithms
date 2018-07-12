package com.taidev198.DataStructure.DesignPattern.FactoryPattern;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class ZooKeeper {

    public static void main(String...args){

        final Food food = FoodFactory.getFood("zebra");
        food.consumed();

    }
}
