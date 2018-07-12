package com.taidev198.DataStructure.Stacks;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author traig on 7/11/2018.
 * @project DataStructure
 */
public class ArrayStack<E> implements Stack<E> {

    private static final int CAPACITY = 1000;//default array capacity
    private E[] data;                       //generic array used for storage
    private int t = -1;                     //index of the top in the stack.
    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];  //safe cast, compiler may give warning.
    }


    @Override
    public int size() {
        return (t +1);
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public void push(E e) throws IllegalStateException {
        if (t == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    @Override
    public E top() {
        if (isEmpty())
        return null;
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpty())
        return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    static String filterString(String html){
        String temp = "";
        int i = 0;
       do {
           temp = html.substring(i ,i+9);
           i++;
       }while (html.indexOf('<',i) != -1
               && !temp.equals("<TD><PRE>"));
       i += 9;
       StringBuilder result = new StringBuilder();
        do {

            result.append(html.charAt(i));
            temp = html.substring(i ,i+6);
            i++;
        }while (html.indexOf('<',i) != -1
                && !temp.equals("</PRE>"));
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
       return null;
    }

    public static void main(String...args){

       System.out.println(increaseNumberRoundness(902200100));

        //Queue<Integer> queue = new ArrayDeque<>();
    }

   static boolean increaseNumberRoundness(int n) {
       String temp = Integer.toString(n);
       int i =temp.length() -1;
       int indexOfO = temp.lastIndexOf('0');
       if (indexOfO == -1)
           return false;
       while(temp.charAt(i) == '0')
           i++;

       return false;
   }
}
