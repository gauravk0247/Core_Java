// 08/09/23
// Q.5 Create object within static block Access static and Non-Static member of another class with static block.
class Assign9{
	int a = 56;
	static int b = 7;
	static{
		System.out.println("Inside static block");
	}
	static void m1(){
		System.out.println("Inside Static method");
	}
	{
		System.out.println("Inside Non-Static Block "+a);
	}
	void m2(){
		System.out.println("Inside Non-Static method ");
	}
	
}
class Assign0{
	static{
		System.out.println("Inside Static-block");
		Assign9 b1 = new Assign9();
		b1.m2();
		b1.m1();
		System.out.println(Assign9.b);
	}
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println("Stop");
	}
}