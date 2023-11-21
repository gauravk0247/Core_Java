// 21/11/23
class Outer{
	void m1(){
		class Inner{
			int a = 100;
		}
		Inner i1 = new Inner();
		System.out.println(i1.a);
	}
	void m2(){
		class Inner{
			float b = 200.5f;
		}
		Inner i1 = new Inner();
		System.out.println(i1.b);
	}
}
class Demo15{
	public static void main(String[] args){
		Outer o1 = new Outer();
		o1.m1();
		o1.m2();
	}
}