//01/09/23
class Const1{
	Const1(){
		System.out.println("Inside Const1 constructor");
	}
	Const1(int a){
		System.out.println("Inside Const1 constructor the value of a is "+a);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Const1 s1 = new Const1();
		Const1 s2 = new Const1(10);
		System.out.println("Stop");
	}
}