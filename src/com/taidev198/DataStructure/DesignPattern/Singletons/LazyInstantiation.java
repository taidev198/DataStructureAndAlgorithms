package com.taidev198.DataStructure.DesignPattern.Singletons;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class LazyInstantiation {

    private static  LazyInstantiation instance;

    private LazyInstantiation(){}

    /**The getInstance() method is now synchronized, which means only one thread will be
     allowed in the method at a time, ensuring that only one object is created.*/
    public synchronized static LazyInstantiation getInstance(){
        if (instance == null)
            instance = new LazyInstantiation();
        return instance;
    }
}
