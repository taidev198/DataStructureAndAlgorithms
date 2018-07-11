package com.taidev198.DataStructure.DynamicProgram;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author traig on 6/27/2018.
 * @project DataStructure
 */
public class DynamicProgram {








}
     class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;

  static boolean isListPalindrome(ListNode<Integer> l) {
             if(l == null || l.next == null)
                 return true;
             ListNode<Integer> temp = l;
             List<Long> result = new ArrayList<Long>();

             while(temp != null){
                 result.add((long) temp.value);
                 temp = temp.next;
             }
             int n = result.size();
             System.out.println(result);
             int i = 0;
             while(i < n/2){
                 if(!result.get(i).equals(result.get(n - i - 1)))
                     return false;
                 i++;

             }

             return true;

         }

         static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

             long NumberA = 0;
             long NumberB = 0;
             while(a != null){
                 NumberA = NumberA *10000 + a.value;
                 a = a.next;
             }

             while(b != null){
                 NumberB = NumberB *10000 + b.value;
                 b = b.next;
             }

             Stack<Integer> result = new Stack<Integer>();
             long convertToStack = NumberA + NumberB;
             while (convertToStack != 0){
                 int num = (int)convertToStack % 10000;
                 result.push(num);
                 convertToStack /= 10000;
             }
             ListNode<Integer> temp = new ListNode<Integer>(result.pop());
             ListNode<Integer> list = temp;
             while (!result.isEmpty()){
                 list.next = new ListNode<Integer>(result.pop());
                 list = list.next;
             }
        return temp;
         }

         public static void main(String...args){


      LinkedList<Integer> linkedList = new LinkedList<Integer>();

             ListNode<Integer> a = new ListNode<Integer>(123);
             a.next = new ListNode<Integer>(4);
             a.next.next = new ListNode<Integer>(5);

             ListNode<Integer> b = new ListNode<Integer>(100);
             b.next = new ListNode<Integer>(100);
             b.next.next = new ListNode<Integer>(100);


            System.out.println(10% (Math.pow(10,9) +7));

         }

         public static int findDuplicate(int[] nums) {
             int l=1,r=nums.length-1;
             while(l<r){
                 int m=(l+r)/2;
                 int c=0;

                 for(int i: nums){
                     if(i<=m){
                         c++;
                     }
                 }

                 //if c < m,
                 if(c>m){
                     r=m;
                 }else{
                     l=m+1;
                 }
             }

             return r;
         }


 }
//
