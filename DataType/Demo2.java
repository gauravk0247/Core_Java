// 27/07/23
// DataType int --> 4byte --> 32 bits
// 2n to -2n-1
// n = 31
// 2147483647 to -2147483648
class Demo2{
	public static void main(String[] args)
	{
		int a =2147483647;
		System.out.println(a);
		// int b = 2147483648; CE
		int c = -2147483648;
		System.out.println(c);
		// int d = -2147483649; CE
	}
}