// Q. Can one abstract class extends from another abstract class.
abstract class Sample5{
	abstract void m1();
}
abstract class Sample4 extends Sample5{
	void m1(){
		System.out.println("Inside m1 method - Sample4");
	}
}
class Sample3 extends Sample4{
	public static void main(){
		Sample5 s1 = new Sample4();
		s1.m1();
	}
}