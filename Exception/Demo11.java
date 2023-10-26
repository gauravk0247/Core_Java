// 26/11/23
class Demo11{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block ArithmeticException");
		}
		catch(Exception ae){
			System.out.println("Inside catch block Exception");
		}
	}
}