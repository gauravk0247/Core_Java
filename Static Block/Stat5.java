// 07/09/23
class Stat5{
	static int a;
	float b;
	static{
		System.out.println("Inside Non-static block "+a);
		a=100;
	}
	{
		System.out.println("Inside Non-Static block "+b);
	}
	Stat5(){
		this(300.45f);
		System.out.println("Inside 0 arg const "+ b);
	}
	Stat5(float b){
		System.out.println("Inside 1 arg const "+b);
	}
	static void m1(){
		System.out.println("Inside static method m2 "+a);
	}
	void m2(float b){
		System.out.println("Inside Non-Static method m1 "+b);
		this.b=b;
	}
	public static void main(String[] args){
		System.out.println("Start");
		Stat5.m1();
		Stat5 s1 = new Stat5();
		s1.m2(500.45f);
		System.out.println("Stop");
	}
}