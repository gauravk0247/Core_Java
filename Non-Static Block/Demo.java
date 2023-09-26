// 05/09/23
class Demo{
	{
		System.out.println("Inside non-static block-1");
	}
	{
		System.out.println("Inside no-static block-2");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Demo d1 = new Demo();
		System.out.println("Stop");
	}
}