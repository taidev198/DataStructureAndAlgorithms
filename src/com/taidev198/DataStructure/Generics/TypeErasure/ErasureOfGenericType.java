package com.taidev198.DataStructure.Generics.TypeErasure;

/**
 * @author traig on 7/13/2018.
 * @project DataStructure
 */
public class ErasureOfGenericType {
    /**Because the type parameter T is unbounded, the Java
     * compiler replaces it with Object.
     * */
    class Node<T>{

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }

    /**Because the generic Node1 class use a bounded type parameter
     * The java compile replaces the bounded type parameter T with the first
     * bound class, Comparable.
     * */
    class Node1<T extends Comparable<T>>{
        private T data;
        private Node1<T> next;

        public Node1(T data, Node1<T> next){
            this.data = data;
            this.next = next;
        }
    }


}
