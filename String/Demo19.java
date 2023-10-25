class Demo19{
	public static void main(String[] args){
		String str = "Cyber";
		String rev = "";
		char c;
		for(int i=str.length()-1;i>=0;i--){
			c=str.charAt(i);
			rev = rev+c;
		}
		System.out.println(rev);
	}
}

class Demo{
	public static void main(String[] args){
		String str1 = "Cyber";
		for(int i=str1.length()-1;i>=0;i--){
			System.out.println(str1.charAt(i));
		}
	}
}