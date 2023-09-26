// 17/08/23
class Method2{
	static int a = 100;
	public static void main()
	{
		System.out.println("Start @ Cyber Success");
		int aa = 200;
	}
}

class Method3{
	public static int b = 100;
	static void t1()
	{
		System.out.println("Start @ Cyber Success");
		int rr = Method2.a+aa;
		System.out.println(rr);
	}
}

class Method4{
	public static void t2(String[] args)
	{
		int result = Method2.a+Method3.b;
		System.out.println(result);
	}
}