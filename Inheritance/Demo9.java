class Demo8{
	static{
		System.out.println("Inside static block");
	}
}
class Demo9 extends Demo8{
	static{
		System.out.println("Inside Static block");
	}
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println("Stop");
	}
}