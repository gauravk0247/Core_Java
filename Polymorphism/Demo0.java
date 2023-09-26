// 26/09/23
class Parent{
	void CarKey(){
		System.out.println("Inside parent key");
	}
}
class Child extends Parent{
	void BikeKey(){
		System.out.println("Inside bike key");
	}
}
class Demo0{
	public static void main(String[] args){
		System.out.println("------------------");
		Parent h1 = new Child();
		h1.CarKey();
		System.out.println("--------------------");
		Child c1 = (Child)h1;
		c1.BikeKey();
		c1.CarKey();
	}
}