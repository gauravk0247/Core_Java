class Demo8{
	static Sample refvar;
	public static void main(String[] args){
	refvar = new Sample();
	refvar.m1();
	}
}
class Sample{
	static int a = 100;
	float b = 300.5f;
	void m1(){
		System.out.println("Inside m1 method");
		Sample obj = new Sample();
		System.out.println(a+obj.b);
	}
}