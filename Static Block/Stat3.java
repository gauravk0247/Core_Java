// 06/09/23
class Stat3{
	boolean val = true;
	static{
		System.out.println("Inside static block");
	}
	void m1(){
		System.out.println("Inside non-static block or instance block "+val);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Stat3 o1 = new Stat3();
		o1.m1();
		System.out.println("Stop");
	}
}