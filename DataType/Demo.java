//27/07/23
// byte --> 1 byte --> 8 bit
// 2n to 2n-1
// 1 to 16 or 0 to 15
// 127 to -128
class Demo{
	public static void main(String[] args)
	{
		byte a = 45;
		a = 50;
		a = 55;
		System.out.println(a);
		byte b;
		// b = 128; CE
		//System.out.println(b);
		byte c = -128;
		System.out.println(c);
		//byte d = -129; CE
	}
}