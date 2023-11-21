// 21/11/23
class Outer{
	int a = 100;
	static float b = 300.5f;
	static class Inner{
		void m1(){
			Outer o1 = new Outer();
			System.out.println(o1.a+b);
		}
	}
}
class Demo11{
	public static void main(String[] args){
		//Outer.Inner i1 = new Outer.Inner();
		//i1.m1();
		new Outer.Inner().m1();
	}
}