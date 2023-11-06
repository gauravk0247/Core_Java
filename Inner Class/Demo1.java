// 06/11/2023
class Outer{
	int a = 1000;
	float b = 2000.5f;
	class Inner{
		int a = 100;
		float b = 300.5f;
		void m1(int a, float b){
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(Outer.this.a+Outer.this.b);
		}
	}
}
class Demo1{
	public static void main(String[] args){
		new Outer().new Inner().m1(10, 20.5f);
	}
}