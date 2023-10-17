// 17/10/23
class Demo10{
	public static void main(String[] args){
		String str1 = "Cyber";
		// charAt method
		System.out.println(str1.charAt(2));
		//System.out.println(str1.charAt(7)); // Exception
		// indexOf method --> print the first character in a string
		System.out.println(str1.indexOf("r")); // print the index number
		System.out.println(str1.indexOf("x")); // print the -1 if it is not present in string
		String str2 = "CyberSuccess";
		System.out.println(str2.indexOf("e"));
		// lastIndexOf --> print the last character in a string
		System.out.println(str2.lastIndexOf("e"));
	}	
}