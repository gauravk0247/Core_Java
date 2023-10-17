// 17/10/23
// Q. How to you convert String to StringBuffer
class Demo6{
	public static void main(String[] args){
		String str1 = "Cyber";
		//str1.append("Success");
		System.out.println(str1);
		// constructor
		StringBuffer sb1 = new StringBuffer(str1);
		System.out.println(sb1);
		sb1.append("Success");
		System.out.println(sb1);
	}
}

// Q. How to you convert StringBuffer to String.
class Demo7{
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("Cyber");
		// Approach - Constructor
		String st1 = new String(sb1);
		System.out.println(st1);
		// Approach - toString();
		String st2 =sb1.toString();
		System.out.println(st2);
	}
}

// Q. Write a java program to check if a given String is palindrome or not.
class Demo8{
	public static void main(String[] args){
		String str1 = "Cyber";
		StringBuffer sb1 = new StringBuffer(str1);
		System.out.println(sb1);
		StringBuffer sb2=sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb2);
		// Refrence Comparison
		System.out.println(sb1.equals(sb2));
		String s11 = sb1.toString();
		String s22 = sb2.toString();
		// Content Comparison
		System.out.println(s11.equals(s22));
	}
}