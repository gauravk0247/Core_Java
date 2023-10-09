// 02/10/23
// Rule - 7 B
class Parent{
	protected void m1(){
		System.out.println("Inside m1 method - Parent");
	}
}
class Child extends Parent{
	public void m1(){
	System.out.println("Inside m1 method - Child");
	}
}
class Sample4{
	public static void main(String[] args){
		Parent p = new Child();
		p.m1();
	}
}