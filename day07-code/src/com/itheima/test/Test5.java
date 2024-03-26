package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        //选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        //1.定义一个数组，存6位评委的分数
        int[] scoreArr = gerScore();
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.println(scoreArr[i]);
//        }
        //2.求数组中的最大值
        int max = getMax(scoreArr);
        //3.求数组中的最小值
        int min = getMin(scoreArr);
        //4.求出数组6个分数的总和
        int sum = getSum(scoreArr);
        //5.（总和-最大值-最小值）/4
        int avg = 0;
        avg = (sum - max - min) / (scoreArr.length -2);
        System.out.println("平均分为："+avg);
    }
    //4.求出数组6个分数的总和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    //3.求数组中的最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //2.求数组中的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //1.定义一个数组，存6位评委的分数
    public static int[] gerScore() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分：");
            int score = sc.nextInt();

            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("输入超出范围，请重新输入，当前的i为：" + i + ".");
            }
        }
        return scores;
    }
}

