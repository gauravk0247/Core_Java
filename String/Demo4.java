// 16/10/23
class Demo4{
	public static void main(String[] args){
		String str1 = "Gaurav";
		String str2 = "Khairnar";
		String str3 = "Gaurav";
		// Check the Referance Comparison
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str1);
		System.out.println("----------------");
		// Content Comparison
		// public boolean equals (java.lang.object);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		System.out.println("------------------");
		String s11 = new String("Gaurav");
		String s22 = new String("Khairnar");
		String s33 = new String("Gaurav");
		System.out.println(s11.equals(s22));
		System.out.println(s22.equals(s33));
		System.out.println(s33.equals(s11));
	}
}

class Demo5{
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("Gaurav");
		StringBuffer sb2 = new StringBuffer("Khairnar");
		StringBuffer sb3 = new StringBuffer("Gaurav");
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		System.out.println(sb3==sb1);
		System.out.println("------------------------");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb3));
		System.out.println(sb3.equals(sb1));
		
	}
}

class Demo6{
	public static void main(String[] args){
		String str1 = "Cyber";
		System.out.println(str1);
		StringBuffer sb1 = new StringBuffer(str1);
		System.out.println(sb1);
	}
}

class Demo7{
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("Cyber");
		System.out.println(sb1);
		String s1 = new String(sb1);
		System.out.println(sb1);
	}
}