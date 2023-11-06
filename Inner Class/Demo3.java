// 06/11/2023
class Outer1{
	int a = 100;
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
	class Inner1{
		float b = 200.5f;
		void m2(){
			System.out.println("Inside m2 method "+b);
		}
	}
}
class Demo3{
	public static void main(String[] args){
		System.out.println("Start");
		// First Way
		Outer1 o1 = new Outer1();
		o1.m1();
		// Second Way
		new Outer().m1();
		// First Way
		Outer1.Inner1 i1 = o1.new Inner1();
		i1.m2();
		// Second Way
		new Outer1().new Inner1().m2();
		System.out.println("Stop");
	}
}