class Cyber1{
	void method1(int a){
		System.out.println("Inside 1 arg int");
	}
	void method1(int b, float c){
		System.out.println("Inside 2 arg int, float");
	}
	void method1(float d){
		System.out.println("Inside 1 arg float");
	}
	public static void main(String[] args){
		Cyber1 c = new Cyber1();
		c.method1(100, 300.45f);
	}
}