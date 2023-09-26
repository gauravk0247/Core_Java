class This2{
	int a = 45;
	float b = 55.6f;
	void m1(int x, float y){
		System.out.println("Inside m1 method");
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args){
		System.out.println("Start");
		This2 s1 = new This2();
		s1.m1(100, 200.5f);
		System.out.println("Stop");
	}
}
// --------------
class This3{
	int a = 45;
	void m1(int x){
		System.out.println("Inside m1 method");
		System.out.println(this.a);
		System.out.println(x);
	}
	public static void main(String[] args){
		This3 s2 = new This3();
		s2.m1(100);
	}
}

// ---------------
class This4{
	int a;
	void m1(int x){
		System.out.println("Inside m1 method");
		System.out.println(this.a);
		System.out.println(x);
	}
	public static void main(String[] args){
		System.out.println("Start");
		This4 s4 = new This4();
		s4.m1(100);
		System.out.println("Stop");
	}
}
// ------------------
class This5{
	int a = 10;
	float b = 20.5f;
	void m1(int x, float y){
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(x+y);
	}
	public static void main(String[] args){
		System.out.println("Start");
		This5 s5 = new This5();
		s5.m1(50, 100.6f);
		System.out.println("-------------");
		s5.m1(100, 1000.5f);
		System.out.println("Stop");
	}
}
// --------------
class This6{
	int a = 100;
	float b = 200.5f;
	void m1(int a, float b){
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args){
		System.out.println("start");
		This6 s5 = new This6();
		s5.m1(1000, 2000.5f);
		System.out.println("stop");
	}
}