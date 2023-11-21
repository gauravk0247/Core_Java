// 21/11/23
class Outer{
	int a = 100;
	static float b = 200.5f;
	static class Inner{
		void m1(){
			System.out.println("Inside m1 method");
			System.out.println(b);
		}
	}
}
class Demo16{
	public static void main(String[] args){
		Outer.Inner i1 = new Outer.Inner();
		i1.m1();
	}
}