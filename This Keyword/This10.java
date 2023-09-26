//05/09/23
class This10{
	This10(){
		this(10);
		System.out.println("Inside 0 argument constructor");
	}
	This10(int a){
		//this();  recursive constructor invocation
		System.out.println("Inside 1 argument constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		This10 s1 = new This10();
		System.out.println("Stop");
	}
}