class Demo6{
	{
		System.out.println("Inside Non-Static or instance block");
	}
	Demo6(){
		System.out.println("Inside 0 arg const");
	}
}
class Demo7{
	{
		System.out.println("Inside Non-Static Block ");
	}
	Demo7(){
		System.out.println("Inside 0 arg const");
	}
	public static void main(String[] args){
		new Demo7();
	}
}