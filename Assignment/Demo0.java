class Demo0{
	int a = 100;
	float b = 300.5f;
	static Demo0 refvar;
	public static void main(String[] args){
		refvar = new Demo0();
		System.out.println(refvar.a);
		System.out.println(refvar.b);
		refvar.a=400;
		refvar.b=700.5f;
		System.out.println(refvar.a);
		System.out.println(refvar.b);
	}
}