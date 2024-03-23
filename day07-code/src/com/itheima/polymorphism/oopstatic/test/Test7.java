package com.itheima.polymorphism.oopstatic.test;

public class Test7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组当中
        //反向推导


        //1.计算出数组的长度
        int number = 12345;
        // 定义一个变量临时记录number的值，为了第三步再次使用
        // 定义一个变量进行统计
        int temp = number;
        int count = 0;
        while (number != 0) {
            //定义一个变量临时记录number的值，就是为了第三步的时候再次使用
            //每一次循环就去掉右边的一个数字
            number = number / 10;
            count++;
        }
        //System.out.println(count);
        //2.定义数组
        //动态初始化
        int[] arr = new int[count];
        //3.把整数上的每一位都添加到数组当中
        int index = arr.length - 1;
        while (temp != 0) {
            // 获取temp里面的每一位数组
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        //验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
