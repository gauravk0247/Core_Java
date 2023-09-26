// 11/08/23
// Types Of Variables
// 1.Local, 2.Static 3.Non-Static
class Static1{
	// int a = 25;  error: non-static variable a cannot be referenced from a static context
	static int b = 100;
	public static void main(String[] args)
	{
		int i = 19;
		// 1. Direct Access Method
		System.out.println(b); 
		
		// 2. ClassName Access 
		System.out.println(Static1.b);
		
		// 3. Object
	}
}