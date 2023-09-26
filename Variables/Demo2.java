// 18/08/23
class Demo4{
	static void m1(){	
		System.out.println("Insdie m1");
	}
}class Demo3{
	static void m2(){	
		System.out.println("Insdie m1");
	}
}
class Demo2{
	public static void main(String[] args)
	{
		Demo4.m1();
		Demo3.m2();
	}
}