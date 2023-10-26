// 26/20/23
class Demo5{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block before");
			System.out.println(10/0);
			System.out.println("Inside try block after");
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block");
		}
	}
}