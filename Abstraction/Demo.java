abstract class Demo1{
	abstract void m1();
}
class Demo extends Demo1{
	void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		Demo1 d1 = new Demo();
		d1.m1();
		Demo d11 = new Demo();
		d11.m1();
	}
}