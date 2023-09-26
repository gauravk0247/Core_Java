class Deva{
	int a = 377;
	static float b = 567.5f;
	public static void main(String[] args){
		Deva refvar1 = Deva.m1();
		System.out.println(refvar1.a+Deva.b);
	}
	static Deva m1(){
		Deva refvar = new Deva();
		System.out.println(refvar.a+Deva.b);
		return refvar;
	}
}