// 21/11/23
class Outer{
	void m1(){
		class Inner{
			int a = 100;
		}
		Inner i1 = new Inner();
		System.out.println(i1.a);
	}
}
class Demo14{
	public static void main(String[] args){
		Outer o1 = new Outer();
		o1.m1();
	}
}