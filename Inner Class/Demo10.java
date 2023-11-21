// 21/11/23
class Outer{
	int a = 100;
	float b = 200.5f;
	class Inner{
		int a = 50;
		float b = 30.5f;
		void m1(int a, float b){
			System.out.println("Inside m1 method");	
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(Outer.this.a+Outer.this.b);
		}
	}
}
class Demo10{
	public static void main(String[] args){
		new Outer().new Inner().m1(10, 20);
	}
}