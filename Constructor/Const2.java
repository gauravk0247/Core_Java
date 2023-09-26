//01/09/23
class Const2{
	Const2(){
		System.out.println("o arg constructor");
	}
	Const2(int a){
		System.out.println("1 arg constructor");
		System.out.println(a);
	}
	Const2(int x, float y){
		System.out.println("2 arg constructor" );
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Const2 s1 = new Const2();
		Const2 s2 = new Const2(10);
		Const2 s3 = new Const2(100, 200.5f);
		System.out.println("Stop");
	}
}