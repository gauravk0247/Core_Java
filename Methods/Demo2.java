// 16/08/23
class Demo2{
	public static void main(String[] args)
	{
		int a = 100;
		// int b = 45;
		int r = test(a);
		System.out.println(r);
	}
	static int test(int aa){ // aa = 100
		System.out.println(aa);
		int result = aa+50;  // 100+50 RHS
		return result;
		
		// LHS = RHS
		// int r = test(a);
		// r = 150 can be store inside it
	}
}