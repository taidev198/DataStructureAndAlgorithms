package com.taidev198.DataStructure.AnalysisAlgorithm;

/**
 * @author traig on 7/7/2018.
 * @project DataStructure
 */
public class AnalysisAlgorithm {


    static void repeat1(char ch, long n){
        String test ="";
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
                test += ch;
        }
        long lastTime = System.currentTimeMillis();

        System.out.print(lastTime - currentTime + "\t");
    }

    static void repeat2(char ch, long n){
        StringBuilder test = new StringBuilder();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            test.append(ch);
        }
        long lastTime = System.currentTimeMillis();

        System.out.println(lastTime - currentTime);
    }

    static void unique1(int[] arr){
        long currentTime = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n -1; j++) {
                if (arr[i] == arr[j])
                    return;

            }
        }
        long lastTime = System.currentTimeMillis();

        System.out.println(lastTime - currentTime);
    }

    public static void main(String...args){
        long count = 50000;

//        for (int i = 0; i < 9; i++) {
//                System.out.print("n:"+ count+'\t');
//                repeat1('a',count);
//                repeat2('a',count);
//                count *=2;
//                System.out.println();
//        }

        unique1(new int[]{1,2,4,5,6,7,8,9,10,11,12,13,14});

    }
}
