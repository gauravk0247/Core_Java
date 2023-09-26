// 24/08/23
class Sample1{
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Sample2{
	float b = 300.4f;
	void m2(){
		System.out.println("Inside m2 method");
	}
}
class Sample{
	public static void main(String[] args){
		System.out.println("Start");
		Sample1 o1 = new Sample1();
		o1.m1();
		Sample2 o2 = new Sample2();
		System.out.println(o2.b);
		o2.m2();
		System.out.println("Stop");
	}
}