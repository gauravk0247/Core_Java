//25/08/23
class Assign2{
	char a = 'c';
	void g1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Assign2 obj = new Assign2();
		System.out.println(obj.a);
		obj.g1();
		System.out.println(obj.b);
		obj.g2();
		System.out.println("Stop");
	}
	byte b = 56;
	void g2(){
		System.out.println("Inside m2 method");
	}
}