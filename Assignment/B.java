// 12/09/23
class A{
	int a = 100;
}
final class B extends A{
	public static void main(String[] args){
		System.out.println("Start");
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println("Stop");
	}
}