class Demo{
	public static void main(String[] args){
		// Unchecked Exception
		//System.out.println(10/0); // ArithmeticException: 
	}
}

class Demo1{
	public static void main(String[] args){
		// Checked Exception
		// Thread.sleep(3000); //unreported exception InterruptedException;
	}
}

class Demo2{
	public static void main(String[] args){
		int[] a = {10, 20, 30};
		// Unchecked  Exception
		// the exception occur during the execution
		System.out.println(a[5]); // ArrayIndexOutOfBoundsException
	}
}