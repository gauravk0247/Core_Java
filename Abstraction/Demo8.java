// Assignmant - create static varibale in abstract class
abstract class Demo6{
	static int a = 45;
}
abstract class Demo7 extends Demo6{
	static float b = 234.67f;
}
class Demo8 extends Demo7{
	public static void main(String[] args){
		System.out.println("Value of a is "+Demo7.a);
		System.out.println("Value of b is "+Demo7.b);
	}
}