// 06/09/23
class Demo3{
	float c = 234.78f;
	static Demo3 y1(){
		System.out.println("Inside static y1 method");
		return new Demo3();
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo3 s11=Demo3.y1();
		System.out.println(s11.c);
		System.out.println("Stop");
	}
}