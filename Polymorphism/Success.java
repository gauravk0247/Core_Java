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
class Success{
	public static void main(String[] args){
		// Upcasting
		Parent P = new Child();
		P.HomeKey();
		// Inheritance
		Child C = new Child();
		C.HomeKey();
	}
}