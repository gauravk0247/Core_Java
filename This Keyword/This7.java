// 04/09/23
class This7{
	This7(){
		System.out.println("Inside 0 argument constructor");
	} 
	This7(int a){
		System.out.println("Inside 1 argument constructor");
	}
	This7(int a, float b){
		System.out.println("Inside 2 argument constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		This7 s1 = new This7();
		This7 s2 = new This7(100);
		This7 s3 = new This7(1000, 2000.5f);
		System.out.println("Stop");
	}
}
// Implement the above program
class This8{
	This8(){
		this(100);
		System.out.println("Inside o argument constructor");
	}
	This8(int a){
		this(1000, 2000.5f);
		System.out.println("Inside 1 argument constructor");
	}
	This8(int a, float b){
		System.out.println("Inside 2 argument constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		This8 d1 = new This8();
		System.out.println("Stop");
	}
}