//30/08/23
class Cyber1{
	int a = 100;
	Cyber1 refvar;
	void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		Cyber1 obj1 = new Cyber1();
		obj1.refvar = new Cyber1();
		System.out.println(obj1.refvar.a);
		obj1.refvar.m1();
	}
}