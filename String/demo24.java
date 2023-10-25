// 23/10/23
class demo24{
	public static void main(String[] args){
		String str1 = "Cyber";
		String str2 = "Cyber";
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		int count=0;
		for(int i=0;i<=s1.length()-1;i++){
			for(int j=0;j<=s2.length()-1;j++){
				if(s1.charAt(i)==s2.charAt(j)){
					count++;
					break;
				}
			}
		}
		if(s1.length()==count && str1.length()==str2.length()){
			System.out.println("String are anagram");
		}
		else{
			System.out.println("String are not anagram");
		}

	}
}