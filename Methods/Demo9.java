// 17/08/23
class Demo11{
	static void t1(){
		System.out.println("Inside m1");
	}
}
class Demo10{
	static void t2(){
		System.out.println("Inside m2");
	}
}
class Demo9{
	public static void main(String[] args)
	{
		Demo11.t1();
		Demo10.t2();
	}
}