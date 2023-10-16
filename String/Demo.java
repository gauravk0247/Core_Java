// 14/10/23
class Demo{
	public static void main(String[] args){
		// 1.Without new keyword
		String str1 = "Gaurav";
		System.out.println(str1);
		
		// 2.With new Keyword
		String str2 = new String("Khairnar");
		System.out.println(str2);
		
	}
}

class Demo2{
	public static void main(String[] args){
		String str1 = "Hello";
		String str2 = "Gaurav";
		String str3 = "Hello";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		String s1 = new String("Hello");
		String s2 = new String("Gaurav");
		String s3 = new String("Hello");
	}
	
}