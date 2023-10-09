// 05/10/23
abstract class RBI{
	RBI(){
		System.out.println("Inside 0 arg const RBI");
	}
}
class Customer extends RBI{
	Customer(){
		System.out.println("Inside 0 arg const Customer");
	}
	public static void main(String[] args){
		RBI j1 = new Customer();
	}
}


// 05/10/23
// bydefault constructor and bydefault super statement is generet by compiler
abstract class RBI1{
	RBI1(){
		System.out.println("Inside 0 arg constructor");
	}
}
class Customer1 extends RBI1{
	public static void main(String[] args){
		RBI1 n1 = new Customer1();
	}
}

// 05/10/23
abstract class RBI2{
	RBI2(){
		this(100);
		System.out.println("Inside 0 arg const");
	}
	RBI2(int a){
		System.out.println("Inside 1 arg const "+a);
	}
}
class Customer2 extends RBI2{
	Customer2(){
		this(200.45f);
		System.out.println("Inside 0 arg const Customer2");
	}
	Customer2(float b){
		System.out.println("Inside 1 arg const Customer2 "+b);
	}
	public static void main(String[] args){
		new Customer2();
	}
}