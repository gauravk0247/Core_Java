// Q. Check if we create an instance block within an interface.
interface inter1{
	{
		System.out.println("inside Non-Static block or instance block");
	}
}
class Assign implements inter1{
	public static void main(String[] args){
		inter1 a1 = new inter1();
	}
}