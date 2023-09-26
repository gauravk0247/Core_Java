class Demo7{
	boolean status = true;
	static Demo7 refvar;
	public static void main(String[] args){
		m1();
	}
	static void m1(){
		refvar = new Demo7();
		refvar.m2();
	}
	void m2(){
		System.out.println("Inside m2 method");
		refvar = new Demo7();
		System.out.println(refvar.status);
	}
}