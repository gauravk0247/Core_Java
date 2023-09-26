// 05/09/23
class Demo2{
	{
		System.out.println("inside instance block");
	}
	Demo2(){
		System.out.println("Inside 0 argument constructor");
	}
	Demo2(int a){
		System.out.println("Inside 1 argument constructor "+a);
	}
	void m1(){
		System.out.println("Inside non-static  method m1");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo2 r1 = new Demo2();
		Demo2 r2 = new Demo2(100);
		r1.m1();
		System.out.println("Stop");
	}
}