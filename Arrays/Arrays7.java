// 27/11/23
class Arrays7{
	static int[] m1(){
		System.out.println("Inside m1 method");
		int a=10, b=20, c=30;
		int[] x = new int[3];
		x[0]=a;
		x[1]=b;
		x[2]=c;
		return x;
	}
	public static void main(String[] args){
		int[] aa = Arrays7.m1();
		for(int i=0;i<aa.length;i++){
			System.out.println(aa[i]);
		}
		
		float[] ff = {10.5f, 20.5f, 30.5f};
		new Arrays7().m2(ff);
		
	}
	void m2(float[] yy){
		for(int i=0;i<yy.length;i++){
			System.out.println(yy[i]);
		}
	}
}