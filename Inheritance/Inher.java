class Inher1{
	boolean x = true;
	Inher1(){
		this(300);
		System.out.println("Inside 0 arg constructor");
	}
	Inher1(int aa){
		System.out.println("Inside 1 arg constructor "+aa);
	}
}
class Inher2 extends Inher1{
	int a = 100;
	void m1(){
		System.out.println("Inside m1 method "+ a);
	}
	Inher2(){
		super(500);
		System.out.println("Inside 0 arg constructor Inher2");
	}
	Inher2(int bb){
		System.out.println("Inside 1 arg constructor Inher2 ");
	}
}
class Inher3 extends Inher2{
	float b = 45.67f;
}
class Inher extends Inher3{
	public static void main(String[] args){
		System.out.println("Start");
		Inher h1 = new Inher();
		System.out.println(h1.x);
		System.out.println(h1.a);
		System.out.println(h1.b);
		h1.m1();
		System.out.println("Stop");
	}
}