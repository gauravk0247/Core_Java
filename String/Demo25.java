// 23/10/23
class Demo25{
	public static void main(String[] args){
		String str1 = "Ccyber";
		String str2 = str1.toLowerCase();
		char ch;
		char remove='c';
		for(int i=0;i<str2.length();i++){
			ch=str2.charAt(i);
			if(ch==remove){
				continue;
			}
			else{
			System.out.print(ch);
			}
		}
	}
}