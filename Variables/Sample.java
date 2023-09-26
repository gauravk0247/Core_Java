// 18/08/23
class Sample{
	int a = 45;
	public static void main(String[] args){
		m1();
	}
	static void m1(){
		System.out.println("Inside m1 method");
		Sample obj1 = new Sample();
		System.out.println(obj1.a);
		return;
	}
}