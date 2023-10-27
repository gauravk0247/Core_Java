class Demo23{
	public static void main(String[] args){
		System.out.println(10/0);
		try{
			System.out.println("Inside try block");
		}
		catch(NullPointerException ni){
			System.out.println("Inside catch block");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}