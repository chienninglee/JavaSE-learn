package com.itheima.oop.Homework.T1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone P = new Phone("apple",8999.99,"Titanic");
        System.out.println(P.getBrand());
        System.out.println(P.getPrice());
        System.out.println(P.getColor());

        P.Call();
        P.Msg();
    }
}
