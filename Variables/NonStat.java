// 18/08/23
class NonStat{
	int a = 100;
	public static void main(String[] args)
	{
		NonStat obj = new NonStat();
		int result = test1(obj.a);
		System.out.println(result);

	}
	static int test1(int aa){
		System.out.println("Inside test1 method");
		int result = aa+100;
		return result;
	}
}