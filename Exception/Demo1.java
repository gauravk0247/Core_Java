class Demo1{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block");
			System.out.println(10/2);
		}
	}
}


class Demo2{
	public static void main(String[] args){
		try{
			System.out.println(10/5);
		}
		catch(ArithmeticException ae){
			System.out.println(10/0);
		}
	}
}