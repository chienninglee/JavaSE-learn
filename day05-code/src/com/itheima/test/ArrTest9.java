package com.itheima.test;

import java.util.Random;
//需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
public class ArrTest9 {
    public static void main(String[] args) {
/*        int[] arr ={1,2,3,4,5};
        Random r = new Random();
        int randoIndex = r.nextInt(arr.length);
        System.out.println(randoIndex);*/
        int[]arr = {1,2,3,4,5};
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
