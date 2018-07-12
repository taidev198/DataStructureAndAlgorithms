package com.taidev198.DataStructure.DesignPattern.FactoryPattern;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class Pellets extends Food {

    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten:" + getQuantity());
    }
}
