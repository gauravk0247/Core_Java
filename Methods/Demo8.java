// 17/08/23
class Demo9{
	static void m1(){
		System.out.println("Inside m1");
	}
}
class Demo10{
	static void m2(){
		System.out.println("Insidr m2");
	}
}
class Demo8{
	public static void main(String[] args)
	{
		int a = 100;
		Demo9.m1();
		Demo10.m2();
	}
}