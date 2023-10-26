// 26/20/23
class Demo4{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		// Abnormal Termination
		catch(ArithmeticException ae){
			System.out.println("Inside catch block");
			System.out.println(10/0);
		}
	}
}