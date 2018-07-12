package com.taidev198.DataStructure.DesignPattern.Singletons;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class StaffRegister {

    //instantiation using a static block
    private static final StaffRegister instance;
    static {
        instance = new StaffRegister();
        //Perform additional steps
    }

    private StaffRegister() {}
    public StaffRegister getInstance(){ return instance;}

    //data access methods
}
