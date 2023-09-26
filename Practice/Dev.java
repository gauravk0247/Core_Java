class Dev{
	int a = 56;
	static float b = 687.6f;
	public static void main(String[] args){
		Dev refvar = new Dev();
		float result = refvar.a+b;
		System.out.println(result);
		m1(refvar.a, b);
	}
	static void m1(int a,float b){
		float result = a+b;
		System.out.println(result);
	}
}