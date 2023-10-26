// 26/11/23
class Demo10{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block ae");
		}
		//  exception ArithmeticException has already been caught
		catch(ArithmeticException aee){
			System.out.println("Inside catch block aee");
		}
	}
}