package com.itheima.polymorphism.oopstatic.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        int result = b1 + b2 ;
        byte result2 =(byte) (b1 + b2) ;
        // (byte)b1 + b2 强转的是b1，不是最终的结果。

        System.out.println(result); //30
        System.out.println(result2); //结果发生错误，因为超过了byte数据类型的取值范围了。
    }
}
