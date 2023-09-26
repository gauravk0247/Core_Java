class poly3{
	void m1(int a){
		System.out.println("Inside m1 method 1 arg int");
	}
	void m2(float b){
		System.out.println("Inside m2 method 1 arg float");
	}
	public static void main(String[] args){
		poly3 p = new poly3();
		p.m2(300.30f);
	}
}