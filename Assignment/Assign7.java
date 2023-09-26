// 08/09/23
// Q.3 Access static and Non-static block members of other classes within instance block  
class Assign7{
	int a = 567;
	static float b = 67.78f;
	static{
		System.out.println("Inside static block");
	}
	static void m1(){
		System.out.println("Inside Static method m1");
	}
	{
		System.out.println("Inside Non-static block");
	}
	void m2(){
		System.out.println("Inside Non-Static method");
	}
}
class Assign8{
	{
		System.out.println("Inside Non-Static block Assign8");
		Assign7 l1 = new Assign7();
		System.out.println(l1.a);
		System.out.println(Assign7.b);
		Assign7.m1();
		l1.m2();
		
	}
	public static void main(String[] args){
		System.out.println("Start");
		Assign8 n1 = new Assign8(); 
		System.out.println("Stop");
	}
}