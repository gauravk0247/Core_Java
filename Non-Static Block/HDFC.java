//05/09/23
class HDFC{
	float balance;
	String CustName;
	{
		System.out.println("Logics to connect to verify the Aadhar card, Pan and Address");
	}	
	HDFC(String CustName, float balance){
		System.out.println("Hii "+CustName+" Creating your account and setting your balance ");
		this.balance=balance;
		this.CustName=CustName;
	}
	void getBalance(){
		System.out.println("Hii "+CustName+" Your balance is "+balance);
	}
}
class Customer{
	public static void main(String[] args){
		System.out.println("Start");
		HDFC g1 = new HDFC("Gaurav", 50000.f);
		g1.getBalance();
		System.out.println("Stop");
	}
}