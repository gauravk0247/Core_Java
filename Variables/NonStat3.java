class One{
	int a = 45;
}
class Two{
	float b = 55.5f;
}
class NonStat{
	public static void main(String[] args)
	{
		One obj1 = new One();
		Two obj2 = new Two();
		float result = obj1.a+obj2.b;
		System.out.println(result);
	}
}