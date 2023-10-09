abstract class SampleOne{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
class SampleTwo extends SampleOne{
	void m1(){
		System.out.println("Inside m1 method - SampleTwo");
	}
	void m2(){
		System.out.println("Inside m2 method - SampleTwo");
	}
	void m3(){
		System.out.println("Inside m3 method - SampleTwo");
	}
}
class SampleThree{
	public static void main(String[] args){
		SampleOne s1 = new SampleTwo();
		s1.m1();
		s1.m2();
		s1.m3();
	}
}