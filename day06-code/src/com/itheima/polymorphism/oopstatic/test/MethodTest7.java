package com.itheima.polymorphism.oopstatic.test;

//定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处。
public class MethodTest7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};

        boolean flag = contains(arr, 34);

        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
