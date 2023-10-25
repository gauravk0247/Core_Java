class Demo23{
	public static void main(String[] args){
		String str2 = "Gaurav";
		String str=str2.toLowerCase(); 
		char s1='g';
		int count=0;
		for(int i=0; i<=str.length()-1;i++){
			if(str.charAt(i)==s1){
			count++;
			}
		}
		System.out.println("Count is "+count);
	}
}