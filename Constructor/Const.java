//01/09/23
class Const{
	int a = 24;
	// 0 arg constructor and empty implemenatation argument 
	Const(){
		System.out.println("Inside constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Const s1 = new Const();
		System.out.println("Stop");
	}
}