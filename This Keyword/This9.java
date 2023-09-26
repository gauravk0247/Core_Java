// 04/09/23
class This9{
	int c=1000;
	This9(){
		this(c);
		System.out.println("Inside 0 argument constructor" + c);
		
	}
	This9(int a){
		this(200, 300.5f);
		System.out.println("Inside 1 argument constructor");
	}
	This9(int x, float y){
		System.out.println("Inside 2 argument constructor");
	}
}
class This0{
	public static void main(String[] args){
		System.out.println("Start");
		This9 s1 = new This9();
		System.out.println("Stop");
	}
}