package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r =new Random();
        //int num = r.nextInt(10);
        // 获取1-100的随机数

        int num = r.nextInt(100)+1;
        System.out.println(num);
    }
}

/*秘诀：
用来生成任意数到任意数之间的随机数 7~15
1.让这个范围头部都减去一个值，让这个范围从0开始，  -7，0 ~ 8
2.尾巴 + 1    8+1=9
3.最终的结果，在加上第一步减去的值
Random r = new Random();
int num = r,nextInt(9)+7;
System.out.printIn(num);
* */

