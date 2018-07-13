package com.taidev198.DataStructure.Generics.WildcardGuideLines;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/13/2018.
 * @project DataStructure
 */
public class WildcardGuideLines {

    /**An "In" Variable
     An "in" variable serves up data to the code. Imagine a copy method with two arguments: copy(src, dest).
     The src argument provides the data to be copied, so it is the "in" parameter.
     An "Out" Variable
     An "out" variable holds data for use elsewhere. In the copy example, copy(src, dest),
     the dest argument accepts data, so it is the "out" parameter.
     */

    /**Wildcard Guidelines:
     An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
     An "out" variable is defined with a lower bounded wildcard, using the super keyword.
     In the case where the "in" variable can be accessed using methods defined in
     the Object class, use an unbounded wildcard.
     In the case where the code needs to access the variable as both
     an "in" and an "out" variable, do not use a wildcard.
     * */

    class NaturalNumber{
        private int i;

        public NaturalNumber(int i){ this.i = i;}
    }

    class EvenNumber extends NaturalNumber{

        public EvenNumber(int i) {
            super(i);
        }
    }

    public static void main(String...args){


        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
        //List<EvenNumber> is subtype of List<? extends NaturalNumber>
        //so ln = le is possible. But u cannot use ln to add a natural number to a list of even number.
        //ln.add(new EvenNumber(10));//compile-time error
        //The following operations on the list are possible:
        //add null;ln.add(null)
        //invoke clear;ln.clear();
        //get the iterator and remove.ln.remove(0).
        //capture the wildcard and write elements that u've read from the list.


    }
}
