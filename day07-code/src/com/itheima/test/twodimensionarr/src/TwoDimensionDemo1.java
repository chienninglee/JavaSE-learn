package com.itheima.test.twodimensionarr.src;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        // 1。二维数组静态初始化格式
        // 数据类型[][]数组名 = new 数据类型[][]{{元素1,元素2},{元素1,元素2}};
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6,7,8}};
        int[][] arr2 = {{1,2,3},{4,5,6,7,8}};
        // 以后建议这样定义，把每一个一维数组，单独写一行
        int[][] arr3 = {
                {1,2,3},
                {4,5,6,7,8}
        };
        //2。获取元素
        // System.out.println(arr3[0]); // 表示获取二维数组中的第一个一维数组 [I@3b6eb2ec
        // arr3[0]:二维数组中的第一个一维数组
        // arr3[0][0]:获取第一个一维数组中0索引的元素
//        System.out.println(arr3[0][0]); // 1
//        System.out.println(arr3[1][4]); // 8
        // System.out.println(arr3[2][4]); // ArrayIndexOutOfBoundsException

        //3.二维数组遍历
        for (int i = 0; i < arr3.length; i++) {
            //i:表示二维数组中的每一个索引
            //arr3[i]:表示二维数组中的每一个元素（一维数组）
            // 内循环：遍历一维数组，得到里面的每一个元素
            for (int j = 0; j < arr3[i].length; j++) {
                // j:表示一维数组中的每一个元素
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

