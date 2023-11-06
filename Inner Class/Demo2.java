// 06/11/2023
class Outer{
	int a = 100;
	static float b = 300.5f;
	class Inner{
		void m1(){
		System.out.println("Inside Inner class");
		System.out.println(a+b);	
		}
	}
}
class Demo2{
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}