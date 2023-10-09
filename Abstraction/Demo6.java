abstract class Demo4{
	abstract void m1();
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Demo5 extends Demo4{
	void m1(){
		System.out.println("Inside m1 method");
	}
	void m3(){
		System.out.println("Inside m2 method");
	}
}
class Demo6{
	public static void main(String[] args){
		Demo4 h1 = new Demo5();
		h1.m1();
		h1.m2();
		h1.m3();
	}
}