class Demo14{
	public static void main(String[] args){
		String str1 = "CyberSuccess";
		// beginindex
		System.out.println(str1.substring(5));
		//System.out.println(str1.substring(15)); // Exception
		// beginindex to endindex
		System.out.println(str1.substring(5,9));
		//System.out.println(str1.substring(1, 15)); // Exception
		String str2 = "Cyber";
		System.out.println(str2.length());
		String str3 = " Myname ";
		System.out.println(str3.trim());
		String str4 = "denote name";
		System.out.println(str4.trim());
		String str5 = "dom dom";
		System.out.println(str5.length());
	}
}