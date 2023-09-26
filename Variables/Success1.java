// 30/08/23
class Success{
	Cyber refvar;
}
class Cyber{
	int a = 100;
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Training{
	public static void main(String[] args){
		Success obj = new Success();
		obj.refvar = new Cyber();
		System.out.println(obj.refvar.a);
		obj.refvar.m1();
	}
}