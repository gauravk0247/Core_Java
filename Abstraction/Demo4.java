// Q. create variables in abstract class.
abstract class Demo3{
	int a = 200;
}
class Demo4 extends Demo3{
	public static void main(String[] args){
		Demo3 g1 = new Demo4();
		System.out.println(g1.a);
	}
}