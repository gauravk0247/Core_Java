// 06/11/2023
class Outer{
	int a = 500;
	class Inner extends Outer{
		int a = 300;
		void m2(){
			System.out.println("Inside m2 method");
			System.out.println(super.a);
		}
	}
}
class Inner{
	public static void main(String[] args){
		System.out.println("Start");
		new Outer().new Inner().m2();
		System.out.println("Stop");
	}
}
// Imp Note - Not only can we access non static members in Inner class, but we can 
// also access static members in Inner class.