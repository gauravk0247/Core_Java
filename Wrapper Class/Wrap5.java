// 03/11/2023
class Wrap5{
	Wrap5(String str){
		
	}
	public static void main(String[] args){
		Integer i1 = new Integer(100);
		System.out.println(i1);
		// All wrapper classes override toString method.
		System.out.println(i1.toString()); //Integer
		Wrap5 d1 = new Wrap5("Cyber");
		System.out.println(d1); // it print the address
		System.out.println(d1.toString()); // it will also print the address --> Object
	}
}