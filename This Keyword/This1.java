// 30/08/23
class This1{
	int a = 1000;
	float b = 2000.5f;
	void m1(int a , float b){
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args){
		This1 s1 = new This1();
		s1.m1(10, 20.5f);
	}
}