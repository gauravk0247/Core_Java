class Demo22{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.exit(0);
		}
		catch(NullPointerException ni){
			System.out.println("Inside catch block");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}