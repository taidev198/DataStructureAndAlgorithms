package com.taidev198.DataStructure.LinkedList;

/**
 * @author traig on 7/11/2018.
 * @project DataStructure
 */
public class SinglyLinkedList<E> {
    //------------nested Node class
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> next){
            element = e;
            this.next = next;
        }

        public E getElement(){ return element;}
        public Node<E> getNext(){ return next;}
        public void setNext(Node<E> next){ this.next = next;}
    }//----------end of nested Node class

    //instance variables of the SinglyLinkedList

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList(){}

    //access methods
    public int size(){ return size;}
    public boolean isEmpty(){ return size ==0;}

    public E first(){//returns (but doesn't remove ) the first element
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last(){//returns (but doesn't remove ) the last element
        if (isEmpty()) return null;
        return tail.getElement();
    }

    //update methods
    /**adds an element at the top of the list.
     * @param e is element to be inserted
     * */
    public void addFirts(E e){
        head = new Node<>(e, head);//create and link to new Node
        if (size == 0)//special case: new node become tail also.
            tail = head;
        size++;
    }

    /**Adds an element in last of the list.
     * @param e is element to be inserted
     * */
    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);//node  will eventually be the tail
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);//new node after existing tail.
        tail = newest;//new node become tail
        size++;
    }

    /**Removes and Returns the first node
     *
     * */
    public E removeFirst(){
        if (isEmpty())
            return null;
       E answer = head.getElement();
       head = head.getNext();
       size--;
       if (size == 0)
           tail = null;
       return answer;
    }
}
