// 07/09/23

class Demo4{
	float d = 200.67f;
	static Demo4 m1(){
		System.out.println("Inside m1 method ");
		return new Demo4(); 
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo4 s11 = Demo4.m1();
		System.out.println(s11.d);
		System.out.println("Stop");
	}
}