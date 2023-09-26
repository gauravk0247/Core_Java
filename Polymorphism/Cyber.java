// 26/09/23
class Parent{
	void HomeKey(){
		System.out.println("Inside Parent Key");
	}
}
class Child extends Parent{
	void HomeKey(){
		System.out.println("Inside Child Key");
	}
}
class Cyber{
	public static void main(String[] args){
		System.out.println("-----------------");
		Parent P = new Child();
		P.HomeKey();
	}
}