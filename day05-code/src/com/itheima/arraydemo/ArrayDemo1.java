package com.itheima.arraydemo;
//数组静态初始化

public class ArrayDemo1 {
    public static void main(String[] args) {
/*
        int arr1[] = new int[]{11, 12, 13, 14};
        int arr2[] = {11, 12, 13, 14};

        String[] arr3 = new String[]{"zhangsan", "lisi", "wangwu"};
        String[] arr4 = {"zhangsan", "lisi", "wangwu"};

        double[] arr5 = new double[]{1.67, 1.85, 1.98};
        double[] arr6 = {1.67, 1.85, 1.98};
*/

        double[] arr6 = {1.67, 1.85, 1.98};
        System.out.println(arr6); //[D@4eec7777 //数组元素的地址值
/*
        数组的地址值：就表示数组在内存中的位置。
        以[I@6d03e736为例：
        [：表示现在打印的是一个数组。
        I：表示现在打印的数组是int类型的。
        @：仅仅是一个间隔符号而已。
        6d03e736：就是数组在内存中真正的地址值。（十六进制的）

        但是，我们习惯性会把[I@6d03e736这个整体称之为数组的地址值。
*/

    }
}
