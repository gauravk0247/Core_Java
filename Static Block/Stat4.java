// 07/09/23
class Stat4{
	static{
		System.out.println("Inside static method");
	}
	{
		System.out.println("Inside Non-Static block");
	}
	public static void main(String[] args){
		System.out.println("Start");
		new Stat();
		new Stat();
		System.out.println("Stop");
	}
}