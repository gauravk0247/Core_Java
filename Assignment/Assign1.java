//25/08/23
class Assign1{
	static int a = 300;
	static void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println(a);
		m1();
		System.out.println(Assign1.a);
		Assign1.m1();
		Assign1 obj = new Assign1();
		System.out.println(obj.a);
		obj.m1();
		System.out.println(obj.b);
		obj.m2();
		System.out.println("Stop");
	}
	boolean b = true;
	void m2(){
		System.out.println("Inside m2 method");
	}
}