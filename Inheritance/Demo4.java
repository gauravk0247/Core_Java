class Demo3{
	int a;
	Demo3(int a){
		System.out.println("Inside 1 arg const");
		System.out.println("Before "+ this.a);
		this.a=a;
		System.out.println("After "+ this.a);
	}
}
class Demo4 extends Demo3{
	Demo4(){
		super(100);
		System.out.println("Inside 1 arg const");
	}
	public static void main(String[] args){
		new Demo4();
	}
}