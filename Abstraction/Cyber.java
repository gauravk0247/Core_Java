// 09/10/23
interface inter1{
	interface inter2{
		void m1();
	}
}
class Cyber implements inter1.inter2{
	public void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		inter1.inter2 c1 = new Cyber();
		c1.m1();
	}
}