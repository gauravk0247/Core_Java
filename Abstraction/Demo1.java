// 03/10/23
abstract class Demo3{
	abstract void m1();
}
class Demo2 extends Demo3{
	void m1(){
		System.out.println("Inside m1 method Child");
	}
}
class Demo1{
	public static void main(String[] args){
		Demo3 d1 = new Demo2();
		d1.m1();
	}
}