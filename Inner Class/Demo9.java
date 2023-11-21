// 21/11/23
class Outer{
	void m2(){
		Inner i1 = new Inner();
		System.out.println(i1.a+i1.b);
		i1.m1();
	}
	private class Inner{
		private int a = 100;
		private float b = 200.5f;
		private void m1(){
			System.out.println("Inside m1 method");
		}
	}
}
class Demo9{
	public static void main(String[] args){
		Outer o1 = new Outer();
		o1.m2();
	}
}