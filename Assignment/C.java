// Q.Assignment - Inheritance using final keyword infront of class B
class A{
	int a = 45;
}
final class B extends A{
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
class C{
	public static void main(String[] args){
		System.out.println("Start");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop");
	}
}