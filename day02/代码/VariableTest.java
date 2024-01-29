public  class VariableTest{
	public static void main(String[] args){
		
		//一开始没有乘客。
		int count = 0;
		//第一站：上去1位乘客，
		count = count + 1;
		//第二站：上去2位，下来1位。
		count = count + 2 -1;
		//第三站：上去2位，下来1位。
		count = count + 2 -1;
		//第四站：下来1位乘客，
		count = count -1;
		//第五站：上去1位。
		count = count + 1;
		//请问：到了终点站，车上一共几位乘客。
		System.out.println("车上一共"+count+"名乘客。");// 车上一共3名乘客。
		
	}
}