// 26/09/23
class Cyber{}
class Parent{
	Cyber m1(){
		System.out.println("Inside Parent class");
		return new Cyber();
	}
}
class Child extends Parent{
	Cyber m1(){
		System.out.println("Inside Child class");
		return new Cyber();
	}
}
class Demo2{
	public static void main(String[] args){
		Child g1 = new Child();
		g1.m1();
	}
}