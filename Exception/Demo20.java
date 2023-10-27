class Demo20{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
		}
		finally{
			System.out.println("Inside finally block");
			try{
				System.out.println("Inside finally - try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae){
				System.out.println("Inside finally - catch block");
			}
		}
	}
}