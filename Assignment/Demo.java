// 23/08/23
class Demo{
	boolean b = true;
	static void g1(){
		Demo2 obj = new Demo2();
		obj.g2();
	}
}
class Demo2{
	static float g2(){
		float b = 55.5f;
		System.out.println(b);
		return b;
	}
}
class Demo3{
	public static void main(String[] args){
		Demo obj1 = new Demo();
		obj1.g1();
		System.out.println(obj1.b);
	}
}