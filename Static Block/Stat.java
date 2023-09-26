// 06/09/23
// static block - Static block excutes during class loading time
// we have to create minimum one static block or multiple static block
// To way have to create an static block
// 1. Inintalize the static member during class loading time
// 2. To implemnt business logic during class loading time

class Stat{
	static{
		System.out.println("Inside static block");
	}
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println("Stop");
	}
}