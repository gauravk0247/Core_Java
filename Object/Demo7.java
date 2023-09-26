// 07/09/23
// pending
class Demo7{
	int a = 100;
	static void m1(){
		System.out.println("Inside m1 method");
		Demo7 g1 = new Demo7();
		return g1;
	}
	public static void main(String[] args){
		g1.m1();
		System.out.println(g1.a);
	}
}