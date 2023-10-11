// 11/10/23
interface intra1{
	static void m1(){
		System.out.println("Inside m1 method");
	}
}
class Meta2 implements intra1{
	static void m1(){
		System.out.println("Inside m1 method child");
	}
	public static void main(String[] args){
		m1();
	}
}