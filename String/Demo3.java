// 14/10/23
// Predefined class is present in javalang package.
/*class object{
	public java.lang.String toString();
}*/
class Demo3{
	public String toString(){
		return "We are in string classes";
	}
	public static void main(String[] args){
		Demo3 d1 = new Demo3();
		System.out.println(d1);
		System.out.println(d1.toString());
		object o1 = new Demo3();
		System.out.println(o1);
		System.out.println(o1.toString());
	}
}