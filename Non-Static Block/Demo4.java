// 05/09/23
class Demo4{
	int a;
	{
		System.out.println("Inside instance block");
		a=10;
	}
	Demo4(){
		System.out.println("Inside 0 argument constructor "+a);
		a=150;
	}
	Demo4(int x){
		System.out.println("Inside 1 argument constructor ");
		System.out.println(this.a);
		a=250;
	}
	void m1(){
		System.out.println("Inside m1 method");
		System.out.println(a);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo4 t1 = new Demo4();
		t1.m1();
		Demo4 t2 = new Demo4(1000);
		t2.m1();
		System.out.println("Stop");
	}
}