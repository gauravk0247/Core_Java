//25/08/23
class Assign3{
	int a = 567;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Assign4{
	public static void main(String[] args){
		System.out.println("Start");
		Assign4 s2 = new Assign4();
		System.out.println(s2.d);
		s2.m2();
		System.out.println("Stop");
	}
	double d = 897873879;
	void m2(){
		System.out.println("Inside m2 method");
		Assign3 s1 = new Assign3();
		System.out.println(s1.a);
		s1.m1();
	}
}