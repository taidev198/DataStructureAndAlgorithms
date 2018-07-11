package com.taidev198.DataStructure.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/10/2018.
 * @project DataStructure
 */
public class Collections {



    public static void main(String...args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(new Integer(10));
    //    list.remove(new Integer(10));
    //    list.remove(0);
        System.out.println(list);


    }
}
