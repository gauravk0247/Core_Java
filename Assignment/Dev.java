class Dev{
	int a = 100;
	static float b = 76.45f;
	public static void main(String[] args){
		System.out.println("Inside main method");
		Dev obj1 = new Dev();
		System.out.println(obj1.a+Dev.b);
		Dev.m1(obj1);
	}
	static void m1(Dev obj2){
		System.out.println("Inside m1 method");
		System.out.println(obj2.a+Dev.b);
	}
}