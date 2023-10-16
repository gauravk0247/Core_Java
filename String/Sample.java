// 16/10/23
// StringBuffer
class Sample{
	public static void main(String[] args){
		StringBuffer str1 = new StringBuffer("Gaurav");
		System.out.println(str1);
	}
}

class Sample2{
	public static void main(String[] args){
		String str1 = "Cyber";
		str1=str1.concat("Success");
		System.out.println(str1);
		StringBuffer str2 = new StringBuffer("Tech");
		str2.append("Training");
		System.out.println(str2);
	}
}

class Sample3{
	public static void main(String[] args){
		String str1 = "Cyber";
		System.out.println(str1);
		str1=str1.concat("Success");
		System.out.println(str1);
	}
}