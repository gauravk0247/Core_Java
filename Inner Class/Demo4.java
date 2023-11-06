class Outer2{
	int a = 100;
	float b =200.5f;
	void m1(){
		System.out.println("Inside m1 method");
		System.out.println(a+b);
	}
	class Inner2{
		int c = 200;
		float d = 300.5f;
		void m2(){
			System.out.println("Inside m2 method");	
			System.out.println(c+d);
			m1();
		}
	}
}
class Demo4{
	public static void main(String[] args){
		System.out.println("Start");
		new Outer2().new Inner2().m2();
		System.out.println("Stop");
	}
}