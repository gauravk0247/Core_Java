// 21/11/23
class Outer{
	int a = 100;
	int b = 200;
	void m2(){
		Inner i1 = new Inner();
		i1.m1();
	}
	private class Inner{
		void m1(){
			System.out.println("Inside m1 method");
		}
	}
}
class Demo12{
	public static void main(String[] args){
		Outer o1 = new Outer();
		o1.m2();
	}
}