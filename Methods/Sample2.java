class Sample2{
	static char a = 'x';
	static void m1(){
		System.out.println(a);
		System.out.println(Sample2.a);
		Sample2 obj = new Sample2();
		System.out.println(obj.a);
	} 
}
class Sample{
	public static void main(String[] args){
		Sample2.m1();
		Sample2 obj2 = new Sample2();
		obj2.m1();
	}
}