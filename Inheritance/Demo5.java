class Demo4{
	int a=100;
}
class Demo5 extends Demo4{
	int a = 200;
	Demo5(int a){
		System.out.println("Inside 0 arg const");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args){
		new Demo5(300);
	}
}
