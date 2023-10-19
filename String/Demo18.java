// StringBuilder
// 19/20/23
class Demo18{
	public static void main(String[] args){
		String str1 = "Gaurav";
		StringBuilder sb1 = new StringBuilder(str1); 
		System.out.println(sb1.reverse());
	}
}

// Assignment - StringBuilder to String Conversion
class Demo19{
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder("Gaurav");
		String st1 = new String(sb1);
		System.out.println(st1);
	}
}