// 23/08/23
class Sample4{
	static float a= 200.5f;
	static void test1(){
		System.out.println("Inside test1 Method");
	}
	public static void main(String[] args){
		System.out.println("Start @ Cyber Success");
		//Direct Access
		System.out.println(a);
		test1();
		//ClassName
		System.out.println(Sample4.a);
		Sample4.test1();
		//Object
		Sample4 obj1 = new Sample4();
		System.out.println(obj1.a);
		obj1.test1();
		System.out.println("Stop @ Cyber Success");
	}
}