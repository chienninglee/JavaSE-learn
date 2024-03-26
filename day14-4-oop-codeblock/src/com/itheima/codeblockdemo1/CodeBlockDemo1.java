package com.itheima.codeblockdemo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
/*        // {局部代码块}
        {
            int a = 10;
        } // 因为当代码块执行到这里时，变量a就从内存中消失了
          // System.out.println(a);*/

        //创建对象
        Student s = new Student();
        Student s2 = new Student("zhangsan", 18);

        Student s3 = new Student("zhangsan");
    }
}
