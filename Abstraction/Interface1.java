// 06/10/23
interface Inter1{
	void m1();
}
class Interface1 implements Inter1{
	public void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		Interface1 i1 = new Interface1(); 
		i1.m1(); // Overriding
		Inter1 j1 = new Interface1();
		j1.m1();
	}
}