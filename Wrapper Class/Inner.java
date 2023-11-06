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
		System.out.println();
		new Outer().new Inner().m2();
		System.out.println();
	}
}