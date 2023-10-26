// 26/10/23
class Demo6{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		// statement not allowd in between try and catch block
		//System.out.println("In between try and catch block");
		catch(ArithmeticException ae){
			System.out.println("Inside catch block");
		}
	}
}