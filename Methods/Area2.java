class Area2{
	static float b = 200.5f;
	static void test1(){
		System.out.println("Inside test1");
	}
}
class Area{
	public static void main(String[] args){
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
	static void m1(){
		System.out.println(Area2.b);
		Area2.test1();
		Area2 obj = new Area2();
		Area2.test1();
	}
}