package com.taidev198.DataStructure.Stacks;

import com.taidev198.DataStructure.LinkedList.SinglyLinkedList;

/**
 * @author traig on 7/11/2018.
 * @project DataStructure
 */
public class LinkedStack<E> implements Stack<E>{

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();//an empty list
    public LinkedStack(){}

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirts(e);
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

}
