class Demo13{
	public static void main(String[] args){
		int [] a = {10, 20, 30};
		try{
			System.out.println("Outer try block");
			try{
				System.out.println("Outer block - Inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae){
				System.out.println("Outer try block - Inner catch block");
			}
		System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Outer catch block");
			try{
				System.out.println("Outer catch block - Inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae){
				System.out.println("Outer catch block - Inner try block");
			}
		}
	}
}