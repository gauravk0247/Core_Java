// 11/08/23

class Static4{
	static float var1 = 100.5f;
	public static void main(String[] args)
	{
		System.out.println("Class1");
	}
}

class Static5{
	static int var2 = 300;
	public static void main(String[] args)
	{
		System.out.println("Class2");
	}
}

class Static6{
	static float var3 = Static4.var1+Static5.var2;
	public static void main(String[] args)
	{
		System.out.println("Class3");
	}
}

class Static7{
	public static void main(String[] args)
	{
		System.out.println(Static6.var3);
	}
}