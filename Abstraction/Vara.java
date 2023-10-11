// 10/10/23
interface inter1{
	int a = 100;
}
class Vara1 implements inter1{
	void m1(){
		System.out.println("Inside m1 method");
		System.out.println(a);
	}
}
class Vara extends Vara1{
	public static void main(String[] args){
		Vara1 v1 = new Vara();
		v1.m1();
		System.out.println(a);
		// a=200; // can not be change beacause when we create varible inside interface it is final 
		// System.out.println(a);
	}
}