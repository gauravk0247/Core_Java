class Demo7{
	{
		System.out.println("Inside non-static or instance block");
	}
}
class Demo8 extends Demo7{
	{
	System.out.println("Inside Non-static block");
	}
	public static void main(String[] args){
		new Demo8();
	}
}