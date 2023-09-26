// 06/09/23
class Demo{
	boolean x = true;
	float z = 123.45f;
	static{
		System.out.println("Inside static block");
	}
	void m1(){
		System.out.println("Inside m1 method "+x);
	}
	public static void main(String[] args){
		System.out.println("Start");
		// 1. Name Object Creation
		Demo h1 = new Demo();
		h1.m1();
		System.out.println("Stop");
	}
}