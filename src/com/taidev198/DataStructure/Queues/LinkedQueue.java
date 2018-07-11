package com.taidev198.DataStructure.Queues;

import com.taidev198.DataStructure.LinkedList.SinglyLinkedList;

/**
 * @author traig on 7/11/2018.
 * @project DataStructure
 */
public class LinkedQueue<E> implements Queue<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    private LinkedQueue(){ }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void Enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
