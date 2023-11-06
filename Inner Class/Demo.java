// 06/11/2023
class Outer{
	private int a = 200;
	private float b = 200.5f;
	class Inner{
		void m1(){
			System.out.println(a+b);
		}
	}
}
class Demo{
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}
//  Note - Innerclass comes within the outer class, hence outer class members can be accessed anywhere within the respective Outer class and hence possible to access within class.