// 08/09/23
// Q.4 Access Non-Static members in static block
class Assign8{
	boolean x = true;
	{
		System.out.println("Inside Non-Static block "+x);
	}
	void m1(){
		System.out.println("Inside Non-static block");
	}
	static{
		Assign8 k1 = new Assign8();
		k1.m1();
	}
	public static void main(String[] args){
		System.out.println("Start");
		
		System.out.println("Stop");
	}
}