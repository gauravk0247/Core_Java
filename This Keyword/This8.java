// 04/09/23
class This8{
	This8(){
		this(100);
		System.out.println("Inside 0 argument constructor");
	}
	This8(int a){
		System.out.println("Inside 1 argument constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		This8 s1 = new This8();
		System.out.println("Stop");
	}
}  
// this keyword can be used anywhere within the method or construtor
// this statement can apply before after adding this keyword in constuctor shows an error 
// -->  call to this must be first statement in constructor
                this(10);
class This9{
	This9(){
		System.out.println("Inside o argument constructor");
		this(10);
	}
	This9(int a){
		System.out.println("Inside 1 argument constructor");
	}
	public static  void main(String[] args){
		System.out.println("Start");
		This9 f1 = new This9();
		System.out.println("Stop");
	}
}