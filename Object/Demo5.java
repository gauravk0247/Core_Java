// 07/09/23

class Demo5{
	char g = 'g';
	static void m1(){
		System.out.println("Inside m1 method ");
	}
	public static void main(String[] args){
		System.out.println("Start");
		new Demo4().m1();
		System.out.println(new Demo() .g);
		System.out.println("Stop");
	}
}