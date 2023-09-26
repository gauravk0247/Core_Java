// 23/08/23
class Mix{
	static void m1(){
		System.out.println("Inside m1 method");
	}
}
class Mix1{
	void m2(){
		System.out.println("Inside m2 Non-Static method");
	}
	float var = 2000.4f;
}
class Mix2{
	public static void main(String[] args){
		//ClassName Access
		Mix.m1();
		//Object Access
		Mix obj = new Mix();
		obj.m1();
		
		//Non-Static method can be access by only Object Approach
		Mix1 obj1 = new Mix1();
		obj1.m2();
		System.out.println(obj1.var);
		
		//Static Member Access in Static Area
		//Direct Access in Same class
		m3();
		//ClassName
		Mix2.m3();
		//Object Access
		Mix2 obj2 = new Mix2();
		obj2.m3();
		obj2.m4();
	}
	static void m3(){
		System.out.println("Inside m3 method");
	}
	void m4(){
		System.out.println("Inside m4 Non-Static method");
	}
}
