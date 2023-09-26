// 24/08/23
class Dept1{
	int a = 345;
	void t1(){
		System.out.println("Inside t1 method");
	}
}
class Dept{
	public static void main(String[] args){
		System.out.println("Start");
		Dept1 obj = new Dept1();
		System.out.println(obj.a);
		obj.t1();
		Dept obj1 = new Dept();
		obj1.t2();
		System.out.println("Stop");
	}
	void t2(){
		System.out.println("Inside t2 method");
	}
}