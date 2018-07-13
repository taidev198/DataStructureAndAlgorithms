package com.taidev198.DataStructure.Generics.WildcardsAndSubtyping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/12/2018.
 * @project DataStructure
 */
public class WildcardsAndSubtyping {

    class A{}
    class B extends A{}

    /**Although B is subtype of A, List<B> is not subtype of List<A> and,
     * in fact, these two types are not related. The common parent of List<A> and List<B>
     * is List<?>
     * */

    /**In order to create a relationship between these classes so that the code can access
     * A'methods through List<B>'s elements, use an upper bounded wildcard:
     *          List<? extends  A> la = new ArrayList<>();
     *         List<? extends  B> lb = new ArrayList<>();
     *         la = lb;
     * Because B is subtype of A, and la is list of A, and lb is list of B,
     * a relationship now exist between la and lb
     * */
    public static void main(String...args){

        List<? extends  A> la = new ArrayList<>();
        List<? extends  B> lb = new ArrayList<>();

    }


}
