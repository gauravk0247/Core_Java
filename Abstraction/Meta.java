// 06/10/23
interface Inter1{
	void m1();
	void m2();
	void m3();
}
class Meta implements Inter1{
	public void m1(){
		System.out.println("Inside m1 method");
	}
	public void m2(){
		System.out.println("Inside m2 method");
	}
	public void m3(){
		System.out.println("Inside m3 method");
	}
	public static void main(String[] args){
		Inter1 k1 = new Meta();
		k1.m1();
		k1.m2();
		k1.m3();
	}
}