package com.taidev198.DataStructure.Generics;

import java.util.List;

/**
 * @author traig on 7/13/2018.
 * @project DataStructure
 */
public class WildcardCapture {

    void foo(List<?> i){//the compiler processes the i input parameter as being of type Object
        //When the foo method invokes List.set(index, E), the compiler is not able to confirm the type
        //of Object that being inserted into the list.
      //  i.set(0,i.get(0));
        fooHelper(i);
    }

    private <T> void fooHelper(List<T> l){
        l.set(0,l.get(0));
    }
}
