// 24/08/23
class Decad1{
	static int a = 677;
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Decad{
	public static void main(String[] args){
		System.out.println("Start");
		Decad obj2 = new Decad();
		obj2.m2();
		System.out.println("Stop");
	}
	void m2(){
		System.out.println("Inside m2 method");
		Decad1 obj = new Decad1();
		System.out.println(obj.a);
		obj.m1();
	}
}