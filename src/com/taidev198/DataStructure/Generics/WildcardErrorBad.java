package com.taidev198.DataStructure.Generics;

import java.util.List;

/**
 * @author traig on 7/13/2018.
 * @project DataStructure
 */
public class WildcardErrorBad {

    private void swapFirst (List<? extends Number> l1, List<? extends Number> l2){
        Number temp = l1.get(0);

        //l1.set(0, l2.get(0));
    }
}
