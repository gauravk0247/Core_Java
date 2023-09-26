// 26/09/23
class Parent{
	int a = 100;
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
class Child extends Parent{
	float b = 200.45f;
	void m2(){
	System.out.println("Inside m2 method "+b);
	}
}
class Demo7{
	public static void main(String[] args){
		System.out.println("Start");
		Parent p1 = new Child();
		p1.m1();
		System.out.println("---------------");
		Child cc = (Child)p1;
		cc.m1();
		cc.m2();
		System.out.println("Stop");
	}
}