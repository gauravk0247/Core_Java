// 21/08/23
// Ww have created the non-static method and print thed message of the m1 method
// In Primitive data type their are mainly three data types
// 1. Local
// 2. Static
// 3. Non-Static
class NonStat{
	public static void main(String[] args)
	{
		System.out.println("Start @ Cyber Succes");
		NonStat obj1 = new NonStat();
		obj1.m1();
		System.out.println("Stop @ Cyber Succes");
	}
	void m1(){
		System.out.println("Inside m1 method");
	}
}