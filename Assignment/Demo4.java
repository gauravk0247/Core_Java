//24/08/23
class Demo{
	static int a = 100;
	static void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		System.out.println("Start");
		//Direct Access
		System.out.println(a);
		m1();
		//ClassName
		System.out.println(Demo.a);
		Demo.m1();
		//object
		Demo obj1 = new Demo();
		System.out.println(obj1.a);
		obj1.m1();
		//Calling m2 Non-Static method and non-static variable
		System.out.println(obj1.b);
		obj1.m2();
		System.out.println("Stop");
	}
	int b = 400;
	void m2(){
		System.out.println("Inside m2 method");
	}
}