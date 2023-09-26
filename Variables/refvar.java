class refvar{
	int a = 100;
	refvar obj1;
	public static void main(String[] args){
		refvar c1 = new refvar();
		System.out.println(c1.a);
		c1.obj1 = new refvar();
		System.out.println(c1.obj1.a);
		c1.a=200;
		c1.obj1.a = 300;
		System.out.println(c1.a);
		System.out.println(c1.obj1.a);
	}
}