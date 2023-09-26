class NonStat1{
	static int a = 500;
	static void m1(){
		System.out.println("Inside m1 method");
	}
}
class NonStat{
	public static void main(String[] args){
		NonStat s1 = new NonStat();
		s1.m2();
	}
	void m2(){
		System.out.println("Inside m2 method");
		//ClassName Access
		System.out.println(NonStat1.a);
		NonStat1.m1();
		//Object Access
		NonStat1 s2 = new NonStat1();
		System.out.println(s2.a);
		s2.m1();
	}
}