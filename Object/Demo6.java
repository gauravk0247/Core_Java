// 07/09/23
class Demo7{
	int a = 100;
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Demo6{
	public static void main(String[] args){
		System.out.println("Start");
		// Nameless Object
		new Demo7().m1();
		System.out.println(new Demo7().a);
		System.out.println("Stop");
	}
}

// 07/09/23
class Demo8{
	int a = 100;
	static Demo8 m1(){
		System.out.println("Inside m1 method");
		return new Demo8();
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo8 p11=Demo8.m1();
		System.out.println(p11.a);
		System.out.println("Stop");
	}
}