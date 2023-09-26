// 26/09/23
class Parent{
	Parent m1(){
		System.out.println("Inside Parent class");
		return new Parent();
	}
}
class Child extends Parent{
	Child m1(){
		System.out.println("Inside Child class");
		return new Child();
	}
}
class Demo5{
	public static void main(String[] args){
		System.out.println("Start");
		Child c1 = new Child();
		c1.m1();
		System.out.println("Stop");
	}
}