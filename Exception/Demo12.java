// 26/11/23
class Demo12{
	public static void main(String[] args){
		int[] a = {10, 20, 30};
		try{
			System.out.println("Inside try block");
			System.out.println(10/2);
			System.out.println(a[20]);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block - ArithmeticException");
		}
		catch(Exception aee){
			System.out.println("Inside catch block - Exception");
		}
	}
}