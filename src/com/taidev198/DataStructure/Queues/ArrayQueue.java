package com.taidev198.DataStructure.Queues;

/**
 * @author traig on 7/11/2018.
 * @project DataStructure
 */
public class ArrayQueue<E> implements Queue<E> {

    private E[] data;   //generic array used for storage
    private int f = 0;  //index of the front element
    private int sz =0;  //current number of elements

    //constructors
    public ArrayQueue(){ this(CAPACITY);}

    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return sz ==0;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public void Enqueue(E e) throws IllegalStateException{
        if (sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + sz) & data.length;
        data[avail] = e;
        sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E anwser = data[f];
        data[f] = null;
        f = (f +1) & data.length;
        sz --;
        return anwser;
    }
}
