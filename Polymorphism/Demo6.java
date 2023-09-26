// 26/09/23
class Parent{
	int a = 100;
}
class Child extends Parent{
	float b = 200.5f;
}
class Demo6{
	public static void main(String[] args){
		Child c1 = new Child();
		System.out.println(c1.b);
		System.out.println(c1.a);
		System.out.println("------------------");
		// Upcasting
		Parent p1 = new Child();
		System.out.println(p1.a);
		//System.out.println(p1.b); -- CE
		System.out.println("-----------------");
		// Downcasting
		Child cc = (Child)p1;
		System.out.println(cc.a);
		System.out.println(cc.b);
	}
}