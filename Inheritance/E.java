// 12/09/23
class A{
	int a = 100;
}
class B extends A{
	a = 200;
}
class C extends A{
	c = 300
}
class D extends B{
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
class E extends C{
	void m2(){
		System.out.println("Inside m2 method "+a);
	}
}
class classOne{
	public static void main(String[] args){
		System.out.println("Start");
		D d1 = new D();
		d1.m1();
		System.out.println("-----------------------");
		E e1 = new E();
		e1.m2();
		System.out.println("Stop");
	}
}