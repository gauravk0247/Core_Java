class Sample{
	static boolean x = true;
	public static void main(String[] args){
		m1();
	}
	static void m1()
	{
		System.out.println(x);
		System.out.println(Sample.x);
		Sample obj = new Sample();
		System.out.println(obj.x);
	}
}