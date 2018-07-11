package com.taidev198.DataStructure.Queues;

/**
 * @author traig on 7/11/2018.
 * @project DataStructure
 */
public interface Queue<E> {
    int CAPACITY = 10000;
    /**Returns the number of elements in the queue.*/
    int size();

    /**Tests whether the queue is empty.*/
    boolean isEmpty();

    /**Returns, but doesn't remove, the first elements of the queue.*/
    E first();

    void Enqueue(E e);

    E dequeue();
}
