class Demo19{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
		}
		finally{
			System.out.println("Inside finally block");
			System.out.println(10/0);
		}
	}
}