class poly{
	void test(){
		System.out.println("Inside test method 0 arg");
	}
	void test(int a){
		System.out.println("Inside test method 1 arg");
	}
	void test(int a, float b){
		System.out.println("Inside test method 2 arg");
	}
}
class poly1{
	public static void main(String[] args){
		poly p1 = new poly();
		p1.test(200, 400.45f);
	}
}