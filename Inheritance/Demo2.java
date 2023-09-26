// 11/09/23
class X{
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Y extends X{
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Z extends Y{
	void m3(){
		System.out.println("Inside m3 methdod");
	}
}
class Demo2{
	public static void main(String[] args){
		System.out.println("Start");
		X x1 = new X();
		x1.m1();
		System.out.println("---------------------");
		Y y1 = new Y();
		y1.m1();
		y1.m2();
		System.out.println("------------------");
		Z z1 = new Z();
		z1.m1();
		z1.m2();
		z1.m3();
		System.out.println("Stop");
	}
}

// Another Way
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
	public static void main(String[] args){
		System.out.println("Start");
		X x1 = new X();
		x1.m1();
		System.out.println("----------------");
		Y y1 =new Y();
		y1.m1();
		y1.m2();
		System.out.println("----------------");
		Z z1 = new Z();
		z1.m1();
		z1.m2();
		z1.m3();
		System.out.println("Stop");
	}
}