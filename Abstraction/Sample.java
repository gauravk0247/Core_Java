// 03/10/23
// Q. Create empty and incomplete method in abstract class.

abstract class sampleOne{
	abstract void m1();
	void m2(){
		System.out.println("Inside m2 method - sampleOne");
	}
}
class sampleTwo extends sampleOne{
	void m1(){
		System.out.println("Inside m1 method - sampleTwo");
	}
	void m2(){
		System.out.println("Inside m2 method - sampleTwo");
	}
}
class Sample{
	public static void main(String[] args){
		sampleOne s1 = new sampleTwo();
		s1.m1();
		s1.m2();
	}
}