// 17/10/23
// Q. write a java program to check if user entered username if having minimum 6 letters.
class Demo9{
	public static void main(String[] args){
		String un = "GauravKhairnar";
		if(un.length()>=6){
			System.out.println("Username Allowed");
		}
		else{
			System.out.println("Not Allowed");
		}
	}
}

// length method in string
class Demo0{
	public static void main(String[] args){
		String str1 = "Gaurav";
		System.out.println(str1.length());
	}
}