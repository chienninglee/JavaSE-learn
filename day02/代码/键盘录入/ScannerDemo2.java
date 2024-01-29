//1、导包
import java.util.Scanner;

public  class ScannerDemo2{
	public static void main(String[] args){
	//2、创建对象
	Scanner sc = new Scanner(System.in);
	
	System.out.println("请输入第一个数字：");
	int num1 = sc.nextInt();
	//3、接收数据
	//变量 i 记录了键盘录入的数据
	
	System.out.println("请输入第二个数字：");
	int num2 = sc.nextInt();
	System.out.println(num1 + num2);
	
	}
}