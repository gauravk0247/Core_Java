// Q. Create Variables in an abstract class.
abstract class Sample4{
	abstract int a = 24;
}
class Sample3 extends Sample4{
}
class Sample2{
	public static void main(String[] args){
		Sample4 s1 = new Sample3();
		System.out.println(s1.a);
	}
}