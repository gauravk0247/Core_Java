// Q. Create an incomplete static method in abstract class.

abstract class Sample3{
	abstract static void m1();
}
class Sample2 extends Sample3{
	void m1(){
		System.out.println("Inside m1 method - Sample2");
	}
}
class Sample1{
	public static void main(String[] args){
		Sample3 s1 = new Sample1();
		s1.m1();
	}
}