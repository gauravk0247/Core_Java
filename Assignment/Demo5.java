//24/08/23
class Demo6{
	int c = 34557;
	void m3(){
		System.out.println("Inside m3 method");
	}
}
class Demo5{
	float a = 678.66f;
	void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo5 obj = new Demo5();
		obj.m1();
		obj.m2();
		Demo6 obj2 = new Demo6();
		System.out.println(obj2.c);
		obj2.m3();
		System.out.println("Stop");
	}
	void m2(){
		System.out.println("Inside m2 method");
	}
}