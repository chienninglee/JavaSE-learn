package com.itheima.polymorphism.oopstatic.test;
//数组数据交换

public class ArrTest7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
