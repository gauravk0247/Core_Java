class Demo4{
	int a = 100;
	void m1(int a){
		System.out.println("Inside m1 method Parent");
	}
}
class Demo3 extends Demo4{
	int a = 200;
	void m1(int a){
		System.out.println("Inside m1 method Child");
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(a);
	}
	void m3(float b){
		System.out.println("Inside m2 method Child");
	}
}
class Demo2{
	public static void main(String[] args){
		Demo3 cc = new Demo3();
		cc.m1(300);
	}
}