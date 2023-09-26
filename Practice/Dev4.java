class Dev4{
	int a = 56;
	static float b = 687.6f;
	public static void main(String[] args){
		float result = m1();
		//float result =refvar.a+b;
		System.out.println(result);
		m1();
	}
	static float m1(){
		Dev refvar = new Dev();
		float result = refvar.a+Dev4.b;
		System.out.println(result);
		return result;
		
	}
}