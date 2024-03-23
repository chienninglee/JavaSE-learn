package com.itheima.polymorphism.oopstatic.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        //获取下标索引为0的值并打印
        int num = arr[0];
        System.out.println(num);
        //重新给下标索引为0的数据赋值为2并打印
        num = arr[0] =2;
        System.out.println(num);
    }
}
