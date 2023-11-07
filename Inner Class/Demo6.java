class Outer2{
	static int a = 100;
	static void m1(){
		System.out.println("Inside m1 method "+a);
	}
	class Inner2{
		float b = 300.5f;
		void m2(){
			System.out.println("Inside m2 method");	
			System.out.println(a+b);
			Outer2.m1();
		}
	}
}
class Demo6{
	public static void main(String[] args){
		System.out.println("Start");
		new Outer2().new Inner2().m2();
		System.out.println("Stop");
	}
}