interface HDFC{
	void banking();
	void insurance();
	void finance();
}
abstract class HDFC_banking implements HDFC{
	public void banking(){
		System.out.println("inside banking implementation");
	}
}
abstract class HDFC_insurance extends HDFC_banking{
	public void insurance(){
		System.out.println("inside insurance implementation");
	}
}
class HDFC_finance extends HDFC_insurance{
	public void finance(){
		System.out.println("Inside finance implementation");
	}
}
class Meta1{
	public static void main(String[] args){
		HDFC services = new HDFC_finance();
		services.banking();
		services.insurance();
		services.finance();
	}
}