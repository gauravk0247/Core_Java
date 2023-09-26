class Dev{
	int a = 56;
	static float b = 687.6f;
	public static void main(String[] args){
		Dev refvar1 = m1();
		System.out.println(refvar1.a+b);
	}
	static void m1(){
		Dev refvar = new Dev();
		System.out.println(refvar.a+Dev.b);
		return refvar;	
	}
}