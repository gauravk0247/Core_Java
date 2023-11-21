// 21/11/23
class Outer{
	void m1(){
		Inner i1 = new Inner();
		System.out.println(i1.a);
		System.out.println(Outer.Inner.b);
	}
	static class Inner{
		int a = 100;
		static float b = 200.5f;
	}
}
class  Demo19{
	public static void main(String[] args){
		Outer o1 = new Outer();
		o1.m1();
	}
}