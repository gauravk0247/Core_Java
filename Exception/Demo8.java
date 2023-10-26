// 26/11/23
class Demo8{
	public static void main(String[] args){
		int[] a = {10, 20, 30};
		try{
			System.out.println(10/2);
			System.out.println(a[2]);
		}
		catch(ArithmeticException ae){
			System.out.println("inside catch block");
		}
	}
}

class Demo9{
	public static void main(String[] args){
		int[] a = {10, 20, 30};
		try{
			System.out.println(10/2);
			System.out.println(a[20]);
		}
		catch(ArithmeticException ae){
			System.out.println("inside catch block ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("Inside catch block ArrayIndexOutOfBoundsException");
		}
	}
}