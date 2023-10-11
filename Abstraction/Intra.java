// 10/10/23
interface inter1{
	static void m1(){
		System.out.println("Inside m1 method");
	}
}
class Intra implements inter1{
	public static void main(String[] args){
		inter1.m1();
	}
}