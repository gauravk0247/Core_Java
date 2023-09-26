// 18/08/23
class NonStatic{
	int a = 100; // Non-static 
	public static void main(String[] args)
	{
		// System.out.println(a); Direct Approach can not work CE
		// System.out.println(NonStatic.a); ClassName Approach cannot work CE
		
		
		// Object Approach
		// Syntax
		// ClassName ObjectName = new ClassName();
		NonStatic obj1 = new NonStatic();
		System.out.println(obj1.a);
	}
}