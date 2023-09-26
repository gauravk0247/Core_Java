class Const1{
	Const1(){
		this(100);
		System.out.println("Inside 0 arg Constructor");
	}
	Const1(int a){
		System.out.println("Inside 1 Arg Const "+a);
	}
}
class Const2 extends Const1{
	Const2(){
		super(200);
		System.out.println("Inside 0 arg const ");
	}Const2(int b){
		System.out.println("Inside 1 arg const ");
	}
}
class Const0{
	public static void main(String[] args){
		Const2 m2 = new Const2();
		Const2 m4 = new Const2();
	}
}