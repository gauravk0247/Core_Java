// 18/10/23
class Demo12{
	public static void main(String[] args){
		String str1 = "Cyber";
		System.out.println(str1.contains("ber")); // true
		System.out.println(str1.contains("xyz")); // false
		System.out.println(str1.startsWith("Cy")); // true
		System.out.println(str1.startsWith("cd")); // false
		System.out.println(str1.endsWith("er")); // true
		System.out.println(str1.endsWith("kl")); // false
	}
}