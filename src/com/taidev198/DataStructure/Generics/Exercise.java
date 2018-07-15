package com.taidev198.DataStructure.Generics;

import com.taidev198.DataStructure.Stacks.ArrayStack;
import com.taidev198.DataStructure.Stacks.Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traig on 7/13/2018.
 * @project DataStructure
 */
public  class Exercise<T> {


    //exchange the positions of two different elements in an array

    public  void exchangeElem(T[] a, int i, int j){
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> void transfer(Stack<T> t, Stack<T> s){

        while (s.isEmpty()){
            t.push(s.pop());
        }
    }

    public static void main(String...args){

        Stack<Integer> t = new ArrayStack<>();
        Stack<Integer> s = new ArrayStack<>();
        transfer(t,s);

    }

}
