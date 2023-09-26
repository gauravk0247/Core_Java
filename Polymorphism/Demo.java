// 26/09/23
class Parent{
	float m1(){
		System.out.println("Inside Parent class");
		return 200.5f;
	}
}
class Child extends Parent{
	float m1(){
		System.out.println("Inside Child class");
		return 300.5f;
	}
}
class Demo{
	public static void main(String[] args){
	Child c1 = new Child();
	c1.m1();
	}
}