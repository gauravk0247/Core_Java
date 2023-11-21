// 21/11/23
class Outer{
	void m2(){
		System.out.println("Inside m2 method");
		Inner i1 = new Inner();
		System.out.println(i1.a+i1.b);
		i1.m1();
	}
	class Inner{
		private int a = 1000;
		private float b = 2000.5f;
		private void m1(){
			System.out.println("Inside m1 method");
		}
	}
	}
class Demo13{
	public static void main(String[] args){
		Outer o1 = new Outer();
		o1.m2();
	}
}