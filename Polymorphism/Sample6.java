class Meta{
	{
		System.out.println("Inside Instance block of Parent");
	}
	Meta(){
		System.out.println("Inside 0 arg const Parent");
	}
}
class Meta2 extends Meta{
	{
		System.out.println("Inside instance block of Child");
	}
	Meta2(){
		System.out.println("Inside 0 arg constParent");
	}
	
	public static void main(String[] args){
		new Meta2();
	}
}
/*
class Sample6{
	public static void main(String[] args){
		Meta2 n1 = new Meta2();
	}
}
*/
