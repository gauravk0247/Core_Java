// 18/08/23
class Sample2{
	int a = 45;
	int b = 55;
	public static void main(String[] args)
	{
		System.out.println("Inside Sample2");
		Sample obj1 = new Sample();
		System.out.println(obj1.a);
		//result = test1(obj1.a, obj2.b);
		//System.out.println(result);
		Sample2 obj2 = new Sample2();
		System.out.println(obj2.b);
		int result = test1(obj1.a, obj2.b);
		System.out.println(result);
	}
	static int test1(int aa, int bb){
		System.out.println("Insdoe test1");
		int result = aa+bb;
		return result;
	}
}