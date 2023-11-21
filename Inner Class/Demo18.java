// 21/11/23
class Outer{
	int a = 100;
	static float b = 200.5f;
	static class Inner{
		static void m1(){
			System.out.println("Inside m1 method");
			Outer o1 = new Outer();
			System.out.println(o1.a+b);
		}
	}
}
class Demo18{
	public static void main(String[] args){
		Outer.Inner.m1();
	}
}