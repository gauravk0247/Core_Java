// 02/10/23
// Rule - 7 C
// CE
// m1() in Child cannot override m1() in Parent
//       protected void m1(){
//                      ^
//  attempting to assign weaker access privileges; was public
class Parent{
	public void m1(){
		System.out.println("Inside m1 method - Parent");
	}
}
class Child extends Parent{
	protected void m1(){
	System.out.println("Inside m1 method - Child");
	}
}
class Sample5{
	public static void main(String[] args){
		Parent p = new Child();
		p.m1();
	}
}