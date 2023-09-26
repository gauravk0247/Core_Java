class Area{
	static int a = 100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
	static void m1(){
		System.out.println("Inside m1");
		System.out.println(a);
		m2();
	}
	static void m2(){
		System.out.println("Inside m2 method");
	}
}