package com.taidev198.DataStructure.Recursive;

import java.util.Arrays;

/**
 * @author traig on 7/9/2018.
 * @project DataStructure
 */
public class Recursive {


    static double power(int x, int n){
        if (n == 0)
            return 1;
        else {
            double partial = power(x, n /2);
            double result = partial * partial;

            if (n % 2 == 1)
                result *= x;
            return result;
        }
    }


    static int binarySumArray(int[] arr, int low, int high){
        if (low > high)//zero element in subarray
            return 0;
        else if (low == high)//one element in subarray
            return arr[low];
        else {
            int mid = (high + low) /2;
            return binarySumArray(arr, low, mid) + binarySumArray(arr, mid + 1, high);
        }

    }

    static long fibonacciBad(int n){
        if (n <= 1)
            return n;
        else
            return fibonacciBad(n -1) + fibonacciBad(n -2);
    }

    /**returns Array containing the pair of Fibonacci numbers,
     * F(n) and F(n -1)
     */
    static long[] fibonacciGood(int n){
        if (n <= 1)
            return new long[]{n, 0};
        else {
            long[] temp = fibonacciGood(n -1);// returns F(n -1) and F(n -2)
            long[] ans = {temp[0] + temp[1], temp[0]};//We want {Fn, Fn-1}
            return ans;
        }
    }


    /**Use recursively to convert String to Int*/
    static int recurConvertStringToInt(String s){
        if (s.length() == 1)
            return s.charAt(0) - '0';
        else {
            int value = recurConvertStringToInt(s.substring(0,s.length()-1));
            value = value *10 + s.charAt(s.length() -1) - '0';
            return value;
        }

    }

    /**Use recursively to compute logarithm by addition and integer divide
     */

    static int logarit(int a, int b){//
        if(b == 1)
            return 0;
        else {
            int temp = logarit(a, b /a);
            temp ++;
            return temp;
        }
    }

    static boolean elemUniqueness(int[] arr, int n){

        if (n == arr.length )
            return true;
        int Val = arr[n];
        int[] arrWithoutKthElem = new int[arr.length -1];
       System.arraycopy(arr,0,arrWithoutKthElem,0, n );
        System.arraycopy(arr,n + 1,arrWithoutKthElem,n ,arr.length - n-1 );
//        System.out.print("a[" +n + "]:" + Val + '\t' + "  ");
//        for (int i = 0; i < arr.length -1; i++) {
//            System.out.print(arrWithoutKthElem[i] + "  ");
//        }
//        System.out.println();
        return   elemUniqueness(arr, n +1) &&
         elemUniquenessHelper(arrWithoutKthElem, 0, n, Val);

    }

    static boolean elemUniquenessHelper(int[] arr, int left, int right, int target){

        if (left <= right)
        System.out.println("false");
        return false;
    }


    /**Reverse a given string
     * */

    static String recurReverseString(String s){
        if (s.length() == 1)
            return String.valueOf(s.charAt(0));
        return String.valueOf(s.charAt(s.length() -1))
                + recurReverseString(s.substring(0,s.length()-1));
    }

    /**Rearranges an array of integer values so that
     * all the even values appear before all
     * the odd values
     * */

    static void recurEvenElemBeforeOddElem(int[] arr){
        Arrays.sort(arr);
        recurEvenElemBeforeOddElemHelper(arr);
    }

    static void recurEvenElemBeforeOddElemHelper(int[] arr){
        if (arr.length == 1)
            return;

    }

    /**Rearranges all the elements so that all the elements
     * are less than k before k
     * and all the elements are greater than k after k*/

    static void recurPartition(int[] arr, int k){
        int n = arr.length ;
        int left = 0;
        int right = n -1;
        recurPartitionHelper(arr,left, right, k);
    }

    static void recurPartitionHelper(int[] arr, int left, int right, int k){
        if (left < right){
              if (arr[left] < k)
                recurPartitionHelper(arr, left+1, right, k);
              else if (arr[right] > k)
                 recurPartitionHelper(arr, left, right-1, k);

             else if (arr[left] >= k && arr[right] <= k){//swap two elements
                arr[left] += arr[right] ;
                arr[right] = arr[left] - arr[right];
                arr[left] -= arr[right];
                recurPartitionHelper(arr, left+1, right -1, k);
            }
        }
    }


    /**Use recursively to sum of a pair in array up to a given integer
     * */



    public static void main(String...args){
//        long currentTime = System.currentTimeMillis();
//        System.out.println(fibonacciBad(50));
//        long lastTime = System.currentTimeMillis();
//        System.out.println(lastTime - currentTime);
//        currentTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(fibonacciGood(50)));
//        lastTime  = System.currentTimeMillis();
//        System.out.println(lastTime - currentTime);


     System.out.println(elemUniqueness(new int[]{1,2,3,4,4},0));
    }
}
