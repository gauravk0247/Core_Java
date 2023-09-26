// 06/08/23
class Stat1{
	static{
		System.out.println("Inside static block - 1");
	}
	static{
		System.out.println("Inside static block - 2");
	}
	static void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		System.out.println("Start");
		// direct Approach
		m1();
		// ClassName Approach
		Stat1.m1();
		// Objeect Approach
		Stat1 d1 = new Stat1();
		d1.m1();
		System.out.println("Stop");
	}
}

// 06/08/23
class Stat2{
	static int a;
	static{
		System.out.println("Inside static block  - 1 ");
		a=100;
	}
	static void d1(){
		System.out.println("Inside d1 method "+a);
		a=1000;
	}
	public static void main(String[] args){
		System.out.println("Start");
		Stat2.d1();
		System.out.println(Stat2.a);
		System.out.println("Stop");
	}
}
// 06/09/23
class Stat3{
	static String a;
	static{
		System.out.println("Inside static block - 1 "+a);
		a="Vaishnavi";
		
	}
	static{
		System.out.println("Inside static block - 2 "+a);
		a="Gaurav";
	}
	static void m1(){
		System.out.println("Inside m1 method "+a);
		a="Khairnar";
	}
	public static void main(String[] args){
		System.out.println("Start");
		Stat3.m1();
		System.out.println(Stat3.a);
		System.out.println("Stop");
	}
}