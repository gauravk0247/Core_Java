class Demo9{
	public static void main(String[] args){
		Sample2.refvar2 = new Sample1();
		Sample2.refvar2.m1();
		Sample2.refvar = new Sample();
		System.out.println(Sample2.refvar.b);
		
	}
}
class Sample{
	float b = 300.5f;
}
class Sample1{
	void m1(){
		System.out.println("Inside m1 method");
	}
}
class Sample2{
	static Sample refvar;
	static Sample1 refvar2;
}