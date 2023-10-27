class Demo21{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(NullPointerException ni){
			System.out.println("Inside catch block");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}