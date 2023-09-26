//01/09/23
class This5{
	int a;
	void m1(int a){
		System.out.println(a);
		//local var = ref var
		//this.a=a;
		System.out.println(this.a);
	}
	public static void main(String[] args){
		System.out.println("Start");
		This5 s1 = new This5();
		s1.m1(100);
	}
}