package com.taidev198.DataStructure.DesignPattern.Singletons;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class HayStorage {

    private int quantity = 0;
    private HayStorage(){}

    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance(){ return instance;}

    public synchronized void addHay(int amount){ quantity += amount;}

    public synchronized boolean removeHay(int amount){

        if (quantity < amount) return false;

        quantity -= amount;
        return true;
    }

    public synchronized int getQuantity(){ return quantity; }
}
