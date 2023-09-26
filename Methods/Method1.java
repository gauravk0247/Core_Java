// 18/08/23
class Method2{
	static boolean t1(){
		System.out.println("Inside the t1 method");
		boolean x = true;
		return x;
	}
}

class Method1{
	public static void main(String[] args){
		boolean xx = Method2.t1();
		System.out.println(xx);
	}
}