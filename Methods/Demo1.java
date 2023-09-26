// 16/08/23
// access the local varibale value to the another method
class Demo1{
	public static void main(String[] args)
	{
		int a = 45; // local variable
		m1(a);
	}
	static void m1(int add)
	{
		System.out.println(add);
		return;
	}
}