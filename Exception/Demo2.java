// 26/20/23
class Demo2{
	public static void main(String[] args){
		try{
			System.out.println("inside try block");
			System.out.println(10/0);	
		}
		// Abnormal Termination beacause it is a arithmetic exception we use null pointer exception
		catch(NullPointerException np){
			System.out.println("Inside Catch Block");
		}
	}
}