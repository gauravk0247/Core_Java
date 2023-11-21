// 21/11/23
class Success{
	void m1(){
		System.out.println("Inside m1 method");
	}
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Cyber{
	Success s1 = new Success(){
		void m1(){
			System.out.println("Inside m1 method");
			System.out.println(s1.getClass().getName());
		}
		void m2(){
			System.out.println("Inside m2 method");
		}
	};
	public static void main(String[] args){
		Cyber d1 = new Cyber();
		d1.s1.m1();
		d1.s1.m2();
	}
}