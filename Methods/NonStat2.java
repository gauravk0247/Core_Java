// 21/08/23
class One{
	void m1()
	{
		System.out.println("Insdie m1 method");
	}
}
class Two{
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class NonStat2{
	public static void main(String[] args)
	{
		System.out.println("Start @ Cyber Success");
		One obj1 = new One();
		obj1.m1();
		Two obj2 = new Two();
		obj2.m2();
		System.out.println("Stop @ Cyber Success");
	}
}