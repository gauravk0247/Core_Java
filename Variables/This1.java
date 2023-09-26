// 30/08/23
class This1{
	int a = 100;
	float b = 200.5f;
	void m1(int x, float y){
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(x+y);
	}
	public static void main(String[] args){
		This1 obj = new This1();
		obj.m1(10, 20.5f);
	}
}