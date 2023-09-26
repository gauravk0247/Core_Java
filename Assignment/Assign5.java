// 08/09/23
// Q.1 Access static members in non-static blocks.
class Assign5{
	static int a = 45;
	static{
		System.out.println("Inside Static method");
	}
	static void m1(){
		System.out.println("Inside static method m1");
	}
	{
		System.out.println("Inside Non-Static block");
		System.out.println(a);
		m1();
	}
}
class Assign6{
	public static void main(String[] args){
		System.out.println("Start");
		Assign5 g3 = new Assign5();
		System.out.println("Stop");
	}
}