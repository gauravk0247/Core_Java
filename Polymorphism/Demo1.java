// 26/09/23
class Parent{
	int test(){
	System.out.println("Inside Parent class");
	return 100;
	}
}
class Child extends Parent{
	int test(){
	System.out.println("Inside Child class");
	return 200;
	}
}
class Demo1{
	public static void main(String[] args){
		Child c1 = new Child();
		c1.test();
	}
}