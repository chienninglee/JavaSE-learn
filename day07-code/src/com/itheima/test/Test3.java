package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /**需求：
         * 定义方法实现随机产生一个 5 位的验证码
         * 验证码格式： 长度为 5 ，前四位是字母，最后一位是数字
         */

        /**方法：
         * 在随机数据中抽取，可以先把那些数据放入数组中，在随机抽取一个索引。
         *
         * 分析：
         * 大写小写字母都放到数组当中
         * */
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII码表
            if(i<=25){
                //添加小写字母
            chs[i] = (char)(97 + i);
        }else {
                //添加大写字母
                chs[i] = (char)(65 + i - 26);
            }
        }
        // 定义一个字符串类型的变量，用来记录最终的结果
        String result = "";
        //随机抽取 4 次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result+chs[randomIndex];
        }
        //System.out.println(result);

        // 随机抽取一个数字 0 - 9
        int num = r.nextInt(10);
        result = result + num;
        System.out.println(result);
    }
}
