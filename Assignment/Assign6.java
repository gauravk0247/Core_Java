// 08/09/23
// Q.2 Create object within non-static block 
class Assign6{

	{
		System.out.println("Inside Non-Static block");
		Assign6 j1 = new Assign6();
	}
	public static void main(String[] args){
		Assign6 k1 = new Assign6();
	}
}