class Static1{
	static int var1 = 100;
	public static void main(String[] args)
	{
		int var2  = 200;
		int result = var1+var2;
		test1(result);
		//System.out.println(b);
	}
	static void test1(int add)
	{
		System.out.println(add);
		return;
	}
}