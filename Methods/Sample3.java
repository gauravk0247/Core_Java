class Sample{
	static int a = 100;
	public static void main(String[] args)
	{
		System.out.println("Start @ Cyber Success");
		// Direct Access
		System.out.println(a);
		// ClassName
		System.out.println(Sample.a);
		// Object Access
		Sample Obj1 = new Sample();
		System.out.println(Sample.a);
		// Direct Access with same Static Area
		m1();
		// Access ClassName
		Sample.m1();
		System.out.println("Stop @ Cyber Success");
	}
	static void m1(){
		System.out.println("Inside m1 method");
	}
}