package com.taidev198.DataStructure.DivideAndConquer;

import com.sun.istack.internal.NotNull;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author traig on 6/28/2018.
 * @project DataStructure
 */
public class DivideAndConquer {


    static int power(int x, int y){
        int temp ;
        if (y == 0)
            return 1;
        temp = power(x, y /2);

        if(y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;

    }


    static boolean isPalindrome(char[] ch, int n){

        int length = ch.length;
        if (n == 0)
            return ch[n] == ch[length - n -1];
        return ch[n - 1] == ch[length - n] && (isPalindrome(ch, n - 1));
    }



   static int firstDuplicate(@NotNull int[] a) {

        int n = a.length;
        int[] ints;

        int minIndex = n -1;
        int idx = 0;
        //convert array to ArrayList
        List<Object> arrayList  = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> min = new ArrayList<>();
        for (int i = 0; i < n -1  ; i++) {
            int value = a[i];

            int find = arrayList.lastIndexOf(value);//find index from last backward
            int foundIndexBegin = arrayList.indexOf(value);
            if (find != foundIndexBegin){
                min.add(find);
                if ((find ) <= minIndex){
                    minIndex = find ;
                    idx = i;
                }
            }
        }


        if (min.size() == 0)
            return -1;
        return a[idx];

    }


    public static int What3(int a, int b){
        int ans;
        if(b == 0)
            ans = 1;
        else
            if (b % 2 == 0)
                ans = What3(a *a, b/2);
            else
                ans = What3(a *a, b /2 ) *a;
        return ans;

    }

    public static boolean stringPaldimo(String s, int l, int r){
        if (l >= r)
            return true;
        else
            if (s.charAt(l) != s.charAt(r))
                return false;
            else {
                l++;
                r--;
            }

            return stringPaldimo(s,l,r);
    }


    static void permutate(int[] arr, int N){

        if (N == 0){
            for (int i = 0; i < 3; i++) {

                System.out.print(arr[i]);
            }
            System.out.println();
        }else {
            for (int i = 0; i < 3; i++) {
                if (arr[i] == 0){
                    arr[i] = N;
                    permutate(arr, N -1);
                    N++;
                    arr[i] = 0;
                }
            }
        }


    }


    public static int frequency(int[] arr, int start, int end, int val){
        int len = end -start;
        if(len <= 0)
            return 0;
        if (len == 1)
            return arr[start] == val ? 1: 0;

        int len2 = len / 2;

        return frequency(arr, start, start + len2, val)
                + frequency(arr, start + len2, end, val);


    }


    static int additionWithoutCarrying(int param1, int param2) {

        int num = 0;
        StringBuilder result = new StringBuilder();
        while(param1 != 0 && param2 != 0){

            int val1 = param1 %10;
            int val2 = param2 % 10;

            if (val1 + val2 < 10)
                result.insert(0, String.valueOf(val1 + val2));
            else if (val1 + val2 > 10)
                result.insert(0, String.valueOf((val1 + val2) -10));
            else result.insert(0, String.valueOf(0));
            param1 /= 10;
            param2 /= 10;
        }
        while (param1 != 0){
            result.insert(0,String.valueOf(param1 % 10));
            param1 /= 10;
        }
        while (param2 != 0){
            result.insert(0,String.valueOf(param2 % 10));
            param2 /= 10;
        }
        return Integer.valueOf(result.toString());
    }


    static int appleBoxes(int k) {

        return   evenSize(k) ;
    }

    static int oddSize(int n){

        if(n == 1)
            return  1;

        return n % 2 == 1? n *n +oddSize(n -1) : evenSize(n );


    }

    static int evenSize(int n){

        if(n == 2)
            return  4;

        return n % 2 == 0? n *n +evenSize(n -1) : oddSize(n );

    }

    static int commonCharacterCount(String s1, String s2) {
        int len1 = s1.length();

        int count = 0;
        for( int i = 0 ; i< len1; i++){
            int len2 = s2.length();
            char ch = s1.charAt(i);
            if(s2.contains(Character.toString(ch))){
                count++;
               int idexRemove = s2.indexOf(ch);
               String temp = s2.substring(0,idexRemove);
               s2 = s2.substring(idexRemove+ 1,len2);
               s2 = temp + s2;
            }
        }
        return count;

    }

   static boolean isLucky(int n) {

        String val = String.valueOf(n);//convert int to String
        int len = val.length();
        int dif = 0;
       for (int i = 0; i < len /2; i++) {
           dif += ((val.charAt(i) -'0') - (val.charAt(len - i - 1)-'0'));
       }
      return dif == 0;
    }



    public static void main(String...args){
       // System.out.println(power(3,2));
        char[] ch = new char[]{'a','a','t','a','a'};
      //  System.out.println(isPalindrome(ch,ch.length));
       //System.out.println(firstDuplicate(new int[]{2,3,3}));
       // System.out.println(What3(3,2));
       // System.out.println(frequency(new int[]{1,2,1,1}, 0,4,1));
        
//        List<String> list = new ArrayList<>();
//        list.add("thanh");
//        list.add("than");
//
//        String[] result = new String[2];
//        String[] temp =new String[result.length];
//
//        System.arraycopy(result,0,temp,0,result.length);
//      //  result = list.toArray(result);
//       //  Arrays.sort(result);
//        for (String s:
//             temp) {
//            System.out.println(s);
//        }

      System.out.println(isLucky(1221));



    }
}