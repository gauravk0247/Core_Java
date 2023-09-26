// 23/08/23
class Stat{
	void m1(){
		System.out.println("Inside m1 Non-Static method");
	}
	static void m2(){
		System.out.println("Inside m2 Static method");
	}
	static int a = 78;
}

class Stat1{
	float b = 55.5f;
	int m3(){
		int c = 100;
		System.out.println(c);
		return c;
	}
}

class Stat2{
	public static void main(String[] args){
		// Non-Static method can be access by object Access Approach
		Stat obj1 = new Stat();
		//Static variable Access by object Approach
		System.out.println(obj1.a);
		//Static variable Access by ClassName
		//Stat.a();
		obj1.m1();
		// Static method Access in Two ways --> 1.ClassName , 2.Object
		obj1.m2();
		Stat.m2();
		
		Stat1 obj2 = new Stat1();
		System.out.println(obj2.b);
		obj2.m3();
	}
}