// 20/11/2023
class Outer{
	void m2(){
		Inner o1 = new Inner();
		System.out.println(o1.a+o1.b);
		o1.m1();
	}
	private class Inner{
		private int a = 45;
		private float b = 55.5f;
		void m1(){
			System.out.println("Inside m1 method");
		}
	}
}
class Demo8{
	public static void main(String[] args){
	new Outer().m2();	
	}
}