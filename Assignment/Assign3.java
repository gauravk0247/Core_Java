//25/08/23
class Assign{
	boolean a = true;
	void h2(){
		System.out.println("Inside h2 method");
		Assign2 obj1 = new Assign2();
		System.out.println(obj1.b);
		obj1.h1();
	}
}
class Assign2{
	byte b = 67;
	void h1(){
		System.out.println("Inside h1 method");
	}
}
class Assign3{
	public static void main(String[] args){
		System.out.println("Start");
		Assign4 obj2 = new Assign4();
		System.out.println(obj2.c);
		obj2.h3();
		System.out.println("Stop");
	}
}
class Assign4{
	short c = 45;
	void h3(){
		System.out.println("Inside h3 method");
		Assign obj = new Assign();
		System.out.println(obj.a);
		obj.h2();
	}
}