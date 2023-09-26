// Error
class Object{
	void tostring(){
		System.out.println("Try");
	}
}
class Demo11 extends Object{
	public static void main(String[] args){
		Demo11 d1 = new Demo11();
		System.out.println(d1);
		System.out.println(d1.tostring());
	}
}