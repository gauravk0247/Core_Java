abstract class Demo2{
	abstract void m1();
}
abstract class Demo3 extends Demo2{
	abstract void m2();
}
class Demo4 extends Demo3{
	void m1(){
		System.out.println("Inside m1 method");
	}
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Demo5{
	public static void main(String[] args){
		Demo3 s1 = new Demo4();
		s1.m1();
		s1.m2();
	}
}