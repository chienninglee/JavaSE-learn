package com.itheima.test;

//遍历数组得到每一个元素，求数组里面所有的数据之和
public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
