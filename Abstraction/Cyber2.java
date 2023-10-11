// 10/10/23
class Success2{
	interface inter1{
		void m1();
	}
}
class Cyber2 implements Success2.inter1{
	public void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		Cyber2 c1 = new Cyber2();
		c1.m1();
	}
}