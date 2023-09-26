class Dev3{
	int a = 56;
	static float b = 687.6f;
	public static void main(String[] args){
		float result = m1();
		System.out.println(result);
	}
	static float m1(){
		Dev refvar = new Dev();
		float result = refvar.a+Dev.b;
		System.out.println(result);
		return result;
		
	}
}