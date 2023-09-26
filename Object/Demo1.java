// 06/09/23
class Demo1{
	boolean x = true;
	static void m1(Demo1 ss){
		System.out.println("Inside m1 method ");
		System.out.println(ss.x);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo1 s1 = new Demo1();
		Demo1.m1(new Demo1());
		System.out.println("Stop");
	}
}