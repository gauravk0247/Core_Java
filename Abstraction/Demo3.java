// Q. Create empty and complete method in abstract class.
abstract class Demo1{
	abstract void m1();
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Demo2 extends Demo1{
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Demo3{
	public static void main(String[] args){
		Demo1 d1 = new Demo2();
		d1.m1();
		d1.m2();
	}
}