// 21/11/23
class Outer{
	int a = 100;
	float b = 200.5f;
	class Inner{
		void m1(){
			System.out.println("Inside m1 method");
			System.out.println(a+b);
		}
	}
}
class Demo7{
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}