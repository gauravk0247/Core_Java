// 21/11/23
abstract class Success2{
	abstract void m1();
	abstract void m2();
}
class Cyber2{
	Success2 s1 = new Success2(){
	void m1(){System.out.println("Inside m1 method");}
	void m2(){System.out.println("Inside m2 method");}
	};
	public static void main(String[] args){
		Cyber c1 = new Cyber();
		c1.s1.m1();
		c1.s1.m2();
	}
}