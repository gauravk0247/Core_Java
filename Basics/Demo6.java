class Demo6{
	static int a = 55;
	public static void main(String[] args){
	}
}
class Demo7{
	static int b = 45;
	public static void main(String[] args)
	{
	}
}
class Demo8{
	static int c = Demo6.a+Demo7.b;
	public static void main(String[] args)
	{
		System.out.println(c);
	}
}