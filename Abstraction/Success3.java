// Q. check if we have create an constructor within interface.
interface inter1{
	inter1(){
		System.out.println("Inside 0 arg const");
	}
}
class Success3 implements inter1{
	public static void main(String[] args){
		inter1 s3 = new Success3();
	}
}