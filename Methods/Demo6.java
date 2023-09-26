class Demo6{
	public static void main(String[] args)
	{
		int a = 100, b = 200;
		float x = 200.5f, y = 300.5f;
		int result = test1(a, b);
		System.out.println(result);
		float result1 = test2(x, y);
		System.out.println(result1);
	}
	static int test1(int aa, int bb){
		int result = aa+bb;
		return result;
		
	}
	static float test2(float xx, float yy){
		float result1 = xx+yy;
		return result1;
	}
}