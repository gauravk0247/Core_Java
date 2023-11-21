// 21/11/23
interface Inta{
	void m1();
	void m2();
}
class Cyber3{
	Inta i1 = new Inta(){
		public void m1(){
			System.out.println("Inside m1 method");
		}
		public void m2(){
			System.out.println("Inside m2 method");
		}
	};
	public static void main(String[] args){
		Cyber3 c1 = new Cyber3();
		c1.i1.m1();
		c1.i1.m2();
	}
}