package com.itheima.polymorphism.oopstatic.test;

//定义一个数组，遍历得到每一个元素，统计里面一共有几个元素可以被3整除的数字。
public class ArrTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 3 ==0){
                count +=1; //count++;
            }
        }
        System.out.println("数组中能被3整除的数字有"+count+"个。");
    }
}
