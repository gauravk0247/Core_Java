// 10/10/23
interface inter1{
	default void m1(){
		System.out.println("Inside m1 method");
	}
}
class Intra1 implements inter1{
	public static void main(String[] args){
		Intra1 i11 = new Intra1();
		i11.m1();
	}
}