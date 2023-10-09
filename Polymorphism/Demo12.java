// 27/09/23
class Parent{
	static void HomeKey(){
		System.out.println("Inside HomeKey Parent");
	}
}
class Child extends Parent{
	static void HomeKey(){
		System.out.println("Inside HomeKey Child");
	}
}
class Demo12{
	public static void main(String[] args){
		Parent p = new Child();
		p.HomeKey();
	}
}