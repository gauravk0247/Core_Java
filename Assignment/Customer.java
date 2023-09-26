class HDFC{
	int balance;
	String CustName;
	static{
		System.out.println("Logics to Verify Aadhar, Pan-Format and Address");
	}
	{
		System.out.println("Connect to adhar server and generate OTP & verify");
	}
	HDFC(String CustName, int balance){
		System.out.println("Hii "+CustName+" Creating your account and setting your balance "+balance);
		this.CustName=CustName;
		this.balance=balance; 
	}
	void getBalance(){
		System.out.println("Hii "+CustName+" Your balance is "+balance);
	}
	void setBalance(int withdraw){
		balance=balance-withdraw;
		System.out.println("Hii "+CustName+" Your available balance is "+balance);
	}
}
class Customer{
	public static void main(String[] args){
	System.out.println("Start");
	HDFC s1 = new HDFC("Gaurav", 5000);
	s1.getBalance();
	s1.setBalance(3000);
	System.out.println("----------------------------------------");
	HDFC s2 = new HDFC("Vaishnavi", 10000);
	s2.getBalance();
	s2.setBalance(4000);
	System.out.println("Stop");
	}
}