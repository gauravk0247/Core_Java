//24/08/23
class Deco1{
	static int a = 75735;
	static void v1(){
		System.out.println("Inside v1 method");
	}
}
class Deco{
	public static void main(String[] args){
		System.out.println("Start");
		Deco obj = new Deco();
		obj.v2();
		System.out.println("Stop");
	}
	void v2(){
		System.out.println("Inside v2 method");
		//ClassName Approach
		System.out.println(Deco1.a);
		Deco1.v1();
		//Object Access
		Deco1 obj1 = new Deco1();
		System.out.println(obj1.a);
		obj1.v1();
	}
}