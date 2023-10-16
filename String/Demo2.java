// 14/10/23
// The c==1 operator perform what comparison perform refrence comparison.
class Demo2{
	public static void main(String[] args){
		String s1 = "Cyber";
		String s2 = "Success";
		String s3 = "Cyber";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		
		String s11 = new String("Cyber");
		String s22 = new String("Success");
		String s33 = new String("Cyber");
		System.out.println(s11==s22);
		System.out.println(s22==s33);
		System.out.println(s33==s11);
	}
}