// 17/10/23
class Demo5{
	Demo5(String str){
		
	}
	public static void main(String[] args){
		Demo5 d1 = new Demo5("Cyber");
		Demo5 d2 = new Demo5("Cyber");
		Demo5 d3=d1;
		System.out.println(d1.equals(d2));
		System.out.println(d3.equals(d1));
	}
}