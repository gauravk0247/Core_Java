// 12/09/23
// Single level inheritance
class Demos{
	static int a = 100;
}
class Demos1 extends Demos{
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println(a);
		System.out.println("Stop");
	}
}

// Multilevel Inheritance
class Inher{
	static int a = 45;
}
class Inher1 extends Inher{
	static float b = 300.30f;
}
class Inher2 extends Inher1{
	static boolean c = true;
}
class Inher3 extends Inher2{
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Stop");
	}
}

// Multilevel Inheritance 
class Inheri1{
	static int a = 45;
}
class Inheri2 extends Inheri1{
	static void m1(){
		a = 100;
		System.out.println("Inside m1 method "+a);
	}
}
class Inheri3 extends Inheri2{
	static void m2(){
		a = 200;
		System.out.println("Inside m2 method "+a);
	}
}
class Inheri4{
	public static void main(String[] args){
		Inheri3.m1();
		Inheri3.m2();
	}
}