// 26/20/23
class Demo3{
	public static void main(String[] args){
		// if an exception is not raised it never goes to the catch block
		try{
			System.out.println("Inside try block");
			System.out.println(10/2);
		}
		catch(NullPointerException np){
			System.out.println("Inside catch block");
		}
	}
}