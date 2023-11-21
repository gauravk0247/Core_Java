// 21/11/23
class Success{
	void m1(){
		System.out.println("Inside m1 method");
	}
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Demo20{
	Success s1 = new Success(){
		void m1(){
			System.out.println("Inside m1 method - Anonmyous");
		}
		void m2(){
			System.out.println("Inside m2 method - Anonmyous");
		}
	};
	public static void main(String[] args){
		Demo20 d1 = new Demo20();
		d1.s1.m1();
		d1.s1.m2();
	}
}