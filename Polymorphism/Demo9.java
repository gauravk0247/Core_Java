class A{
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class B extends A{
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class C extends B{
	void m3(){
		System.out.println("Inside m3 method");
	}
}
class Sample{
	static void test(A a1){
		System.out.println("Inside test method");
		a1.m1();
		System.out.println("----------------");
		B b1=(B)a1;
		b1.m2();
		b1.m1();
		System.out.println("----------------");
		C c1 = (C)b1;
		c1.m3();
		c1.m2();
		c1.m1();
	}
}
class Demo9{
	public static void main(String[] args){
		Sample.test(new C());
	}
}