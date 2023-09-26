// 27/07/23
// Datatype short --> 2byte --> 16bits
// 2n to -2n-1
// n = 15
// 32767 to -32768
class Demo1{
	public static void main(String[] args)
	{
		short a = 32767;
		System.out.println(a);
		// short b = 32768; CE
		short c = -32768;
		System.out.println(c);
		// short d = -32769; CE
		// System.out.println(d);
	}
}