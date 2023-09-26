// 11/09/23
class A{
	int a = 100;
}
class B extends A{
	float b = 500.50f;
}
class C extends B{
	char c = 'x';
}
class Demo1{
	public static void main(String[] args){
		System.out.println("Start");
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println("_--------------------");
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println("-------------------------");
		C c1 = new C();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println("Stop");
	}
}