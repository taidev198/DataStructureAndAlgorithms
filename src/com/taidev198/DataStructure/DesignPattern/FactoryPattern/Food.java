package com.taidev198.DataStructure.DesignPattern.FactoryPattern;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public abstract class Food {

    private int quantity;

    public Food(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){ return quantity;}

    public abstract void consumed();
}
