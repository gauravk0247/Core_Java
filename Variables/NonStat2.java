// 21/08/23
class NonStat2{
	int a = 100;
}
class NonStat3{
	float b = 200.5f;
}
class NonStat4{
	static float result;
}
class NonStat{
	public static void main(String[] args)
	{
		NonStat2 obj1 = new NonStat2();
		NonStat3 obj2 = new NonStat3();
		float result = obj1.a + obj2.b;
		System.out.println(result);
	}
}