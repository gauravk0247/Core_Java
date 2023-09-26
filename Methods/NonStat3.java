// 21/08/23
class One{
	int m1(){
		//System.out.println("Inside m1 method");
		int a = 100;
		return a;
	}
}
class Two{
	int m2(){
		//System.out.println("Inside m2 method");
		int b = 200;
		return b;
	}
}
class Three{
	void m3(){
		System.out.println("Try New Thinking");
	}
}
class NonStat3{
	public static void main(String[] args)
	{
		System.out.println("Start @ Cyber Success");
		One obj1 = new One();
		obj1.m1();
		//System.out.println(result);
		Two obj2 = new Two();
		obj2.m2();
		int result = obj1.m1() + obj2.m2();
		//int result = obj1.a+obj2.b;
		System.out.println(result);
		System.out.println("Stop @ Cyber Success");
	}
}