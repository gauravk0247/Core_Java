// 26/09/23
class Parent{
	Parent(){
		System.out.println("Inside 0 arg const");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Inside 0 arg class");
	}
}
class Demo4{
	public static void main(String[] args){
		Child g1 = new Child();
	}
}