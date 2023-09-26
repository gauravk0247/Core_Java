// 11/09/23
// Single Inheritance
// Parent
class Demo1{
	int a = 45;
}
// Child
class Demo extends Demo1{
	float b = 56.67f;
	public static void main(String[] args){
		System.out.println("Start");
		Demo1 a1 = new Demo1();
		System.out.println(a1.a);
		// System.out.println(a1.b); CE
		System.out.println("---------------------------");
		Demo b1 = new Demo();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println("Stop");
	}
}