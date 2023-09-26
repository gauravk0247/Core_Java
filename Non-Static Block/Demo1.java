// 05/09/23
class Demo1{
	{
		System.out.println("Inside Non-Static block");
	}
	Demo1(){
		System.out.println("Inside 0 argument constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo1 g1 = new Demo1();
		System.out.println("Stop");
	}
}