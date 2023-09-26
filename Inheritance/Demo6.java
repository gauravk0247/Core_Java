class Demo5{
	void m1(){
		System.out.println("Inside m1 method - Parent");
	}
}
class Demo6 extends Demo5{
	void m1(){
		System.out.println("Inside m1 method - Child");
	}
	void test(){
		System.out.println("Inside test method");
		m1();
		super.m1();
		}
		public static void main(String[] args){
			new Demo6().test();
		}
	}