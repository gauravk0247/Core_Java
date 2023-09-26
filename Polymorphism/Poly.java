class poly{
	void m1(){
		System.out.println("Inside m1 - 0 arg");
	}
	void m1(int a){
		System.out.println("Inside m1 method 1 arg");
	}
	void m1(int a, float b){
		System.out.println("Inside m1 method 2 arg");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args){
		poly d = new poly();
		d.m1(100, 300.5f);
	}
}