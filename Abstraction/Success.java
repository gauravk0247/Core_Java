// 09/10/23
interface it1{
	void m1();
}
interface it2{
	void m2();
}
class Cyber{
	void test(){
		System.out.println("Inside test method");
	}
}
class Success extends Cyber implements it1, it2{
	public void m1(){
		System.out.println("Inside m1 method");
	}
	public void m2(){
		System.out.println("Inside m2 method");
	}
	public static void main(String[] args){
		Success b1 = new Success();
		b1.m1();
		b1.m2();
		b1.test();
	}
}