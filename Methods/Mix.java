// 23/08/23
class Mix{
	static int a = 45;
	int b = 45;
	static void g1(){
		System.out.println("Inside of g1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		//Direct Access of Static variables and Static method
		System.out.println(a);
		g1();
		
		// ClassName Access of Static variables and Static method
		System.out.println(Mix.a);
		Mix.g1();
		
		// Object Static variables
		Mix obj1=new Mix();
		System.out.println(obj1.a);
		// Object Static Method
		obj1.g1();
		System.out.println("Stop");
		
		// Non-Static Access in Static area
		Mix obj2 = new Mix();
		System.out.println(obj2.c);
		obj1.test1();
		
		// Non-Static Method and Non-Static variables Access in Static Area
		Devo obj3 = new Devo();
		obj3.NonStat();
		System.out.println(obj3.var);
	}
	float c = 67.7f;
	void test1(){
		System.out.println("Non Static method");
	}
}
class Devo{
	float var = 680.5f;
	void NonStat(){
		System.out.println("Another class of non-Static method");
	}
}