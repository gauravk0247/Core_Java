// 05/09/23
class Demo3{
	int a;
	{
		System.out.println("Inside Non-Static instance block");
		a=10;
	}
	Demo3(){
		System.out.println("Inside 0 argument constructor "+a);
		a=100;
	}
	void m1(){
		System.out.println("Inside Non-Static method a is "+a);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo3 h1 = new Demo3();
		h1.m1();
		System.out.println("Stop");
	}
}