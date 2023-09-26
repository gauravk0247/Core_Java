// 11/08/23
class Static3{
	static float var1 = 200.5f;
	public static void main(String[] args)
	{
		int var2 = 300;
		float var3 = Static3.var1+var2;
		System.out.println(var3);
	}
}

class Static4{
	static int a = 45;
	public static void main(String[] args)
	{
	}
}

class Static5{
	public static void main(String[] args)
	{
		int b = Static4.a;
		System.out.println(b);
	}
}

class Static6{
	static int var1;
	public static void main(String[] args)
	{
		var1 = 23;
		System.out.println(var1);
	}
}