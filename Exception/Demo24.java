class Demo24{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block");
			// 1.Approach - toString()
			System.out.println(ae.toString());
			// 2.Approach - getMessage()
			System.out.println(ae.getMessage());
			// 3.printStackTrace()
			ae.printStackTrace();
		}
	}
}