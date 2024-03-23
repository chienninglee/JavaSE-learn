package com.itheima.polymorphism.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        s.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);
    }

    //这个方法既能接收老师，学生，还能接收管理员
    //只能把参数写成在三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
