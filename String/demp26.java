class demo26{
	public static void main(String[] args){
		String str1 = "Cyber.Success.docx";
		int ind1 = str1.indexOf(".");
		System.out.println(ind1);
		String str2 = str1.substring(ind1+1);
		System.out.println(str2);
		int ind2 = str2.indexOf(".");
		System.out.println(str2.substring(ind2+1));
	}
}