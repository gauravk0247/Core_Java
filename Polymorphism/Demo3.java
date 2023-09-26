// 26/09/23
class Parent{
	void test(){
		System.out.println("Inside Parent class");
	}
}
class Child extends Parent{
	final void test(){
		System.out.println("Inside Child class");
	}
}
class Demo3{
	public static void main(String[] args){
	Child d1 = new Child();
	d1.test();
	}
}